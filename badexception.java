package Application;

import java.util.List;
import java.lang.String;
import org.springframework.stereotype.Component;

@Component
public class badexception extends RuntimeException {

	private List<error> errorlist;

	public List<error> getErrorlist() {
		return errorlist;
	}

	public void setErrorlist(List<error> errorlist) {
		this.errorlist = errorlist;
	}

	public badexception(String message, List<error> errorlist) {
		super(message);
		this.errorlist = errorlist;
	}

	public badexception() {

	}

}
