package employees.portal.response;

public class SuccessApiResponse {
	private int status;

	private Object data;
	private String message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SuccessApiResponse(int status, Object data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public SuccessApiResponse() {

	}
}