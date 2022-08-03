package Application;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("emprepo")
public interface zemprepository extends JpaRepository<zempmodel, Integer> {

	zempmodel findById(int empid);

}
