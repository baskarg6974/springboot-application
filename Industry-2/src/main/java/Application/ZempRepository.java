package Application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("emprepo")
public interface ZempRepository extends JpaRepository<ZempModel, Integer> {

	ZempModel findById(int empid);

	ZempModel findAllByname(String name);

	List<ZempModel> findAllBydeptno(int deptno);

}
