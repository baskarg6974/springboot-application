package Application;

import org.springframework.stereotype.Component;

@Component
public class error {
	private String field;
	private String message;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public error(String field, String message) {
		super();
		this.field = field;
		this.message = message;
	}

	public error() {

	}

}
