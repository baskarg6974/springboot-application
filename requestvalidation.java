package Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class requestvalidation {

	public List<error> validatetherequest(zempmodel empmodel) {
		List<error> errorlist = new ArrayList<>();

		if (empmodel.getName() == null) {
			error errors = new error("name", "name field is empty(please enter a valid name)");
			errorlist.add(errors);
		}
		if (empmodel.getAge() == 0) {
			error errors = new error("age", "age field is empty(please enter a valid age)");
			errorlist.add(errors);
		}
		if (empmodel.getDeptno() == 0) {
			error errors = new error("deptno", "deptno field is empty(please enter a valid deptno)");
			errorlist.add(errors);
		}
		if (empmodel.getYearjoined() == 0) {
			error errors = new error("yearjoined", "yearjoined field is empty(please enter a valid year)");
			errorlist.add(errors);
		}
		if (empmodel.getEmail() == null) {
			error errors = new error("email", "email field is empty(please enter a valid email)");
			errorlist.add(errors);
		}

		return errorlist;

	}

}
