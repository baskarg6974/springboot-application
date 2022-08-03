package Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
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

@RestController
@RequestMapping("/api/emp")
@Transactional
@Validated
public class zempcontroller {
	List<zempmodel> empmodel3;

	@Autowired
	@Qualifier("empservice")
	zempservice EmpService;

	List<zempmodel> empmodel1;

	@Autowired
	@Qualifier("emprepo")
	zemprepository emprepo;
	@Autowired
	zempmodel empmodel;

	@GetMapping("/get emp")
	@ResponseBody
	@ApiOperation(value = "gives the details of the employees")
	public zempmodel getempZempmodel(@RequestParam int empid) {

		return EmpService.getemp(empid);
	}

	@GetMapping("/get all emp")
	@ResponseBody
	@ApiOperation(value = "gives  the details of all the employees")
	public List<zempmodel> getempZempmodel() {

		return emprepo.findAll();
	}

	@PutMapping("/put emp")
	@ResponseBody
	@ApiOperation(value = "changes the details of the employees")
	public zempmodel putemp(@RequestParam int empid, @RequestBody zempmodel empmodel) {

		return EmpService.putemp(empid, empmodel);
	}

	@PostMapping("/save emp")
	@ResponseBody
	@ApiOperation(value = "save the details of new employee")
	public Object postempZempmodel(@RequestBody zempmodel empmodel) {

		return EmpService.saveemp(empmodel);
	}

	@DeleteMapping("/delete emp")
	@ResponseBody
	@ApiOperation(value = "deletes the details of the employee")
	public void deleteemp(@RequestParam int empid) {
		EmpService.deleteemp(empid);
	}

}
