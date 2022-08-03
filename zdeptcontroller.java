package Application;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dept")
@Transactional
public class zdeptcontroller {
	@Autowired
	zdeptservice deptservice;

	@GetMapping("/getdept")
	@ResponseBody
	public Optional<zdeptmodel> togetdept(@RequestParam int deptno) {
		return deptservice.getdept(deptno);
	}

}
