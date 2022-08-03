package Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component("empservice")
public class zempservice {
	@Autowired
	@Qualifier("emprepo")
	zemprepository emprepo;

	@Autowired
	error Error;

	@Autowired
	requestvalidation reqvalidation;

	@Autowired
	badexception Badexception;

	@Autowired
	apiResponse ApiResponse;

	List<zempdto> empdtolist = new ArrayList<>();

	public zempmodel getemp(int empid) {
		return emprepo.findById(empid);
	}

	public Object saveemp(zempmodel empmodel) {

		List<error> errorlist = reqvalidation.validatetherequest(empmodel);
		if (errorlist.size() > 0) {

			throw new badexception("Bad request", errorlist);

		}

		else {
			emprepo.save(empmodel);
			successapiresponse successApiResponse = new successapiresponse(404, empmodel,
					"user details successfully saved");
			return successApiResponse;

		}
	}

	public void deleteemp(int empid) {

		emprepo.deleteById(empid);

	}

	public List<zempmodel> getallemp() {
		return emprepo.findAll();
	}

	public zempmodel putemp(int empid, zempmodel empmodeldetails) {
		zempmodel empmodel = emprepo.findById(empid);

		empmodel.setName(empmodeldetails.getName());
		empmodel.setAge(empmodeldetails.getAge());
		empmodel.setDeptno(empmodeldetails.getDeptno());
		empmodel.setYearjoined(empmodeldetails.getYearjoined());
		empmodel.setEmail(empmodeldetails.getEmail());
		return emprepo.save(empmodel);

	}

	public zempdto getempbydto(zempmodel empmodel) {

		zempdto empdto = new zempdto();
		empdto.setEmpid(empmodel.getEmpid());
		empdto.setName(empmodel.getName());
		empdto.setDeptno(empmodel.getDeptno());
		empdto.setDeptname(empmodel.getDeptmodel().getDeptname());
		empdto.setDeptloc(empmodel.getDeptmodel().getDeptloc());
		return empdto;
	}

	public List<zempdto> getallempdto() {
		return emprepo.findAll().stream().map(this::getempbydto).collect(Collectors.toList());

	}

}
