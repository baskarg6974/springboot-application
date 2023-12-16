package employees.portal.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import employees.portal.model.DepartmentModel;

@Repository
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<DepartmentModel, Integer> {

}
