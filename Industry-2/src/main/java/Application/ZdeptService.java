package Application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZdeptService {

	@Autowired
	ZdeptRepository deptrepo;

	public Optional<ZdeptModel> getdept(int deptno) {
		return deptrepo.findById(deptno);
	}

	public List<ZdeptModel> getalldept() {
		return deptrepo.findAll();
	}
}
