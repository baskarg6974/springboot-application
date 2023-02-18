package Application;

import java.util.List;
import java.lang.String;
import org.springframework.stereotype.Component;

@Component
public class BadException extends RuntimeException {

	private List<Error> errorlist;

	public List<Error> getErrorlist() {
		return errorlist;
	}

	public void setErrorlist(List<Error> errorlist) {
		this.errorlist = errorlist;
	}

	public BadException(String message, List<Error> errorlist) {
		super(message);
		this.errorlist = errorlist;
	}

	public BadException() {

	}

}
