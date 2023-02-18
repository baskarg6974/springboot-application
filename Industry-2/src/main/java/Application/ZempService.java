package Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component("empservice")
public class ZempService {
	@Autowired
	@Qualifier("emprepo")
	ZempRepository emprepo;

	@Autowired
	Error Error;

	@Autowired
	RequestValidation reqvalidation;

	@Autowired
	BadException Badexception;

	@Autowired
	ApiResponse ApiResponse;

	List<ZempDto> empdtolist = new ArrayList<>();

	public ZempModel getemp(int empid) {
		return emprepo.findById(empid);
	}

	public Object saveemp(ZempModel empmodel) {

		List<Error> errorlist = reqvalidation.validatetherequest(empmodel);
		if (errorlist.size() > 0) {

			throw new BadException("Bad request", errorlist);

		}

		else {
			emprepo.save(empmodel);
			SuccessApiResponse successApiResponse = new SuccessApiResponse(404, empmodel,
					"user details successfully saved");
			return successApiResponse;

		}
	}

	public void deleteemp(int empid) {

		emprepo.deleteById(empid);

	}

	public List<ZempModel> getallemp() {
		return emprepo.findAll();
	}

	public ZempModel putemp(int empid, ZempModel empmodeldetails) {
		ZempModel empmodel = emprepo.findById(empid);

		empmodel.setName(empmodeldetails.getName());
		empmodel.setAge(empmodeldetails.getAge());
		empmodel.setDeptno(empmodeldetails.getDeptno());
		empmodel.setYearjoined(empmodeldetails.getYearjoined());
		empmodel.setEmail(empmodeldetails.getEmail());
		return emprepo.save(empmodel);

	}

	public ZempDto getempbydto(ZempModel empmodel) {

		ZempDto empdto = new ZempDto();
		empdto.setEmpid(empmodel.getEmpid());
		empdto.setName(empmodel.getName());
		empdto.setDeptno(empmodel.getDeptno());
		empdto.setDeptname(empmodel.getDeptmodel().getDeptname());
		empdto.setDeptloc(empmodel.getDeptmodel().getDeptloc());
		return empdto;
	}

	public List<ZempDto> getallempdto() {
		return emprepo.findAll().stream().map(this::getempbydto).collect(Collectors.toList());

	}

}
