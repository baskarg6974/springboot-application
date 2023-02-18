package Application;

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

@CrossOrigin
@RestController
@RequestMapping("/api/dept")
@Transactional
public class ZdeptController {
	@Autowired
	ZdeptService deptservice;

	@GetMapping("/getdept")
	@ResponseBody
	public Optional<ZdeptModel> togetdept(@RequestParam int deptno) {
		return deptservice.getdept(deptno);
	}

	@GetMapping("/getalldept")
	@ResponseBody
	public List<ZdeptModel> togetalldept() {
		return deptservice.getalldept();
	}

}
