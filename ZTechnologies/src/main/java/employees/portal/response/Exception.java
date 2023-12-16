package employees.portal.response;

import java.util.List;
import java.lang.String;
import org.springframework.stereotype.Component;
import employees.portal.model.ErrorResponse;

@Component
public class Exception extends RuntimeException {

	private List<ErrorResponse> errorlist;

	public List<ErrorResponse> getErrorlist() {
		return errorlist;
	}

	public void setErrorlist(List<ErrorResponse> errorlist) {
		this.errorlist = errorlist;
	}

	public Exception(String message, List<ErrorResponse> errorlist) {
		super(message);
		this.errorlist = errorlist;
	}

	public Exception() {

	}

}
