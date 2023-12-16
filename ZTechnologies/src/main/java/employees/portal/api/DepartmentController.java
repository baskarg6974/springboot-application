package employees.portal.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import employees.portal.Impl.DepartmentService;
import employees.portal.model.DepartmentModel;
import io.swagger.annotations.Api;

@CrossOrigin
@RestController
@RequestMapping("/api/dept")
@Transactional
@Api(description = "Handle all department details", tags = "Department")
public class DepartmentController {
	@Autowired
	DepartmentService deptservice;

	@GetMapping("/getdept")
	@ResponseBody
	public Optional<DepartmentModel> togetdept(@RequestParam int deptno) {
		return deptservice.getdept(deptno);
	}

	@GetMapping("/getalldept")
	@ResponseBody
	public List<DepartmentModel> togetalldept() {
		return deptservice.getalldept();
	}

}