package Application;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class zdeptservice {

	@Autowired
	zdeptrepository deptrepo;

	public Optional<zdeptmodel> getdept(int deptno) {
		return deptrepo.findById(deptno);
	}
}
