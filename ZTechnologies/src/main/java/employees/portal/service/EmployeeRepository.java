package employees.portal.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import employees.portal.model.EmployeeModel;

@Repository
@Component("emprepo")
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

	EmployeeModel findById(int empid);

	EmployeeModel findAllByname(String name);

	List<EmployeeModel> findAllBydeptno(int deptno);

}
