package employees.portal.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import employees.portal.model.DepartmentModel;
import employees.portal.service.DepartmentRepository;

@Component
public class DepartmentService {

	@Autowired
	DepartmentRepository deptrepo;

	public Optional<DepartmentModel> getdept(int deptno) {
		return deptrepo.findById(deptno);
	}

	public List<DepartmentModel> getalldept() {
		return deptrepo.findAll();
	}
}