package in.ineuron.globalexcptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.exception.InsertionFailedException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InsertionFailedException.class)
	public ResponseEntity<String> insertionFailException(InsertionFailedException e) {

		return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> unknownException() {

		return new ResponseEntity<String>("Internal Server error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
