package Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/api/emp")
@Transactional
@Validated
public class ZempController {
	List<ZempModel> empmodel3;

	@Autowired
	@Qualifier("empservice")
	ZempService EmpService;

	List<ZempModel> empmodel1;

	@Autowired
	@Qualifier("emprepo")
	ZempRepository emprepo;
	@Autowired
	ZempModel empmodel;

	@GetMapping("/getemp")
	@ResponseBody
	@ApiOperation(value = "gives the details of the employees")
	public ZempModel getempZempmodel(@RequestParam int empid) {

		return EmpService.getemp(empid);
	}

	@GetMapping("/getallemp")
	@ResponseBody
	@ApiOperation(value = "gives  the details of all the employees")
	public List<ZempModel> getempZempmodel() {

		return EmpService.getallemp();
	}

	@PutMapping("/putemp")
	@ResponseBody
	@ApiOperation(value = "changes the details of the employees")
	public ZempModel putemp(@RequestParam int empid, @RequestBody ZempModel empmodel) {

		return EmpService.putemp(empid, empmodel);
	}

	@PostMapping("/saveemp")
	@ResponseBody
	@ApiOperation(value = "save the details of new employee")
	public Object postempZempmodel(@RequestBody ZempModel empmodel) {

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
	public ZempModel getEmpByname(@RequestParam String name) {

		return emprepo.findAllByname(name);
	}

	@GetMapping("/getbydeptno")
	@ResponseBody
	public List<ZempModel> getEmpBydeptno(@RequestParam int deptno) {

		return emprepo.findAllBydeptno(deptno);
	}

	@GetMapping("/getallempdto")
	@ResponseBody
	public List<ZempDto> getallempdto() {

		return EmpService.getallempdto();
	}

}
