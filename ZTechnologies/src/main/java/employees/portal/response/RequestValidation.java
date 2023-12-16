package employees.portal.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import employees.portal.model.ErrorResponse;

import employees.portal.model.EmployeeModel;

@Component
public class RequestValidation {

	public List<ErrorResponse> validatetherequest(EmployeeModel empmodel) {
		List<ErrorResponse> errorlist = new ArrayList<>();

		if (empmodel.getName() == null) {
			ErrorResponse errors = new ErrorResponse("name", "name field is empty(please enter a valid name)");
			errorlist.add(errors);
		}
		if (empmodel.getAge() == 0) {
			ErrorResponse errors = new ErrorResponse("age", "age field is empty(please enter a valid age)");
			errorlist.add(errors);
		}
		if (empmodel.getDeptno() == 0) {
			ErrorResponse errors = new ErrorResponse("deptno", "deptno field is empty(please enter a valid deptno)");
			errorlist.add(errors);
		}
		if (empmodel.getYearjoined() == 0) {
			ErrorResponse errors = new ErrorResponse("yearjoined", "yearjoined field is empty(please enter a valid year)");
			errorlist.add(errors);
		}
		if (empmodel.getEmail() == null) {
			ErrorResponse errors = new ErrorResponse("email", "email field is empty(please enter a valid email)");
			errorlist.add(errors);
		}

		return errorlist;

	}

}
