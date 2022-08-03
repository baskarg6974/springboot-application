package Application;

import org.springframework.stereotype.Component;

@Component
public class apiResponse {

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

	public apiResponse(int status, Object error) {

		this.status = status;

		this.error = error;
	}

	public apiResponse() {

	}

}
