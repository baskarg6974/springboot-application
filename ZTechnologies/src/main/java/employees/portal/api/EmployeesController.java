package employees.portal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import employees.portal.Impl.EmployeeService;
import employees.portal.model.EmployeeDto;
import employees.portal.model.EmployeeModel;
import employees.portal.service.EmployeeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/api/emp")
@Transactional
@Validated
@Component
@Api(description = "Handle all employees details", tags = "Employees")
public class EmployeesController {

	List<EmployeeModel> empmodel3;

	@Autowired
	@Qualifier("empservice")
	EmployeeService EmpService;

	List<EmployeeModel> empmodel1;

	@Autowired
	@Qualifier("emprepo")
	EmployeeRepository emprepo;
	@Autowired
	EmployeeModel empmodel;

	@GetMapping("/getemp")
	@ResponseBody
	@ApiOperation(value = "gives the details of the employees")
	public EmployeeModel getempZempmodel(@RequestParam int empid) {

		return EmpService.getemp(empid);
	}

	@GetMapping("/getallemp")
	@ResponseBody
	@ApiOperation(value = "gives  the details of all the employees")
	public List<EmployeeModel> getempZempmodel() {

		return EmpService.getallemp();
	}

	@PutMapping("/putemp")
	@ResponseBody
	@ApiOperation(value = "changes the details of the employees")
	public EmployeeModel putemp(@RequestParam int empid, @RequestBody EmployeeModel empmodel) {

		return EmpService.putemp(empid, empmodel);
	}

	@PostMapping("/saveemp")
	@ResponseBody
	@ApiOperation(value = "save the details of new employee")
	public Object postempZempmodel(@RequestBody EmployeeModel empmodel) {

		return EmpService.saveemp(empmodel);
	}

	@DeleteMapping("/deleteemp")
	@ResponseBody
	@ApiOperation(value = "deletes the details of the employee")
	public void deleteemp(@RequestParam int empid) {
		EmpService.deleteemp(empid);
	}

	@GetMapping("/getbyname")
	@ResponseBody
	public EmployeeModel getEmpByname(@RequestParam String name) {

		return emprepo.findAllByname(name);
	}

	@GetMapping("/getbydeptno")
	@ResponseBody
	public List<EmployeeModel> getEmpBydeptno(@RequestParam int deptno) {

		return emprepo.findAllBydeptno(deptno);
	}

	@GetMapping("/getallempdto")
	@ResponseBody
	public List<EmployeeDto> getallempdto() {

		return EmpService.getallempdto();
	}

}