package pe.com.cliente.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ResponseBody
	@ExceptionHandler(value = ClienteNoEncontrado.class)
	public ResponseEntity<?> handleException(ClienteNoEncontrado exception) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
