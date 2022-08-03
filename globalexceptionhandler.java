package Application;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalexceptionhandler {

	@ExceptionHandler
	public ResponseEntity badrequest(badexception e) {
		apiResponse apiresponse = new apiResponse();
		apiresponse.setStatus(HttpStatus.BAD_REQUEST.value());
		apiresponse.setError(e.getErrorlist());
		return ResponseEntity.status(404).body(apiresponse);
	}

}
