package employees.portal.response;

import org.springframework.stereotype.Component;

@Component
public class ApiResponse {

	private int status;

	private Object error;

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ApiResponse(int status, Object error) {

		this.status = status;

		this.error = error;
	}

	public ApiResponse() {

	}

}