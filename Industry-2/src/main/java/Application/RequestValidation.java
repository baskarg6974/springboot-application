package Application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RequestValidation {

	public List<Error> validatetherequest(ZempModel empmodel) {
		List<Error> errorlist = new ArrayList<>();

		if (empmodel.getName() == null) {
			Error errors = new Error("name", "name field is empty(please enter a valid name)");
			errorlist.add(errors);
		}
		if (empmodel.getAge() == 0) {
			Error errors = new Error("age", "age field is empty(please enter a valid age)");
			errorlist.add(errors);
		}
		if (empmodel.getDeptno() == 0) {
			Error errors = new Error("deptno", "deptno field is empty(please enter a valid deptno)");
			errorlist.add(errors);
		}
		if (empmodel.getYearjoined() == 0) {
			Error errors = new Error("yearjoined", "yearjoined field is empty(please enter a valid year)");
			errorlist.add(errors);
		}
		if (empmodel.getEmail() == null) {
			Error errors = new Error("email", "email field is empty(please enter a valid email)");
			errorlist.add(errors);
		}

		return errorlist;

	}

}
