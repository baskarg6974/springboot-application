
package employees.portal.model;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
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

	public ErrorResponse(String field, String message) {
		super();
		this.field = field;
		this.message = message;
	}

	public ErrorResponse() {

	}

}