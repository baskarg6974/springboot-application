package employees.portal.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import employees.portal.model.EmployeeDto;
import employees.portal.model.EmployeeModel;
import employees.portal.response.ApiResponse;
import employees.portal.response.Exception;
import employees.portal.response.RequestValidation;
import employees.portal.response.SuccessApiResponse;
import employees.portal.service.EmployeeRepository;
import employees.portal.model.ErrorResponse;

import java.util.stream.Collectors;

@Component("empservice")
public class EmployeeService {
	@Autowired
	@Qualifier("emprepo")
	EmployeeRepository emprepo;

	@Autowired
	ErrorResponse Error;

	@Autowired
	RequestValidation reqvalidation;

	@Autowired
	Exception Badexception;

	@Autowired
	ApiResponse ApiResponse;

	List<EmployeeDto> empdtolist = new ArrayList<>();

	public EmployeeModel getemp(int empid) {
		return emprepo.findById(empid);
	}

	public Object saveemp(EmployeeModel empmodel) {

		List<ErrorResponse> errorlist = reqvalidation.validatetherequest(empmodel);
		if (errorlist.size() > 0) {

			throw new Exception("Bad request", errorlist);

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

	public List<EmployeeModel> getallemp() {
		return emprepo.findAll();
	}

	public EmployeeModel putemp(int empid, EmployeeModel empmodeldetails) {
		EmployeeModel empmodel = emprepo.findById(empid);

		empmodel.setName(empmodeldetails.getName());
		empmodel.setAge(empmodeldetails.getAge());
		empmodel.setDeptno(empmodeldetails.getDeptno());
		empmodel.setYearjoined(empmodeldetails.getYearjoined());
		empmodel.setEmail(empmodeldetails.getEmail());
		return emprepo.save(empmodel);

	}

	public EmployeeDto getempbydto(EmployeeModel empmodel) {

		EmployeeDto empdto = new EmployeeDto();
		empdto.setEmpid(empmodel.getEmpid());
		empdto.setName(empmodel.getName());
		empdto.setDeptno(empmodel.getDeptno());
		empdto.setDeptname(empmodel.getDeptmodel().getDeptname());
		empdto.setDeptloc(empmodel.getDeptmodel().getDeptloc());
		return empdto;
	}

	public List<EmployeeDto> getallempdto() {
		return emprepo.findAll().stream().map(this::getempbydto).collect(Collectors.toList());

	}

}
