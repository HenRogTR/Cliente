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
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMensaje());
	}

	@ResponseBody
	@ExceptionHandler(value = ClienteExiste.class)
	public ResponseEntity<?> handleException(ClienteExiste exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Tipo y número de documento ya existe");
	}

	@ResponseBody
	@ExceptionHandler(value = DatoNoValidado.class)
	public ResponseEntity<?> handleException(DatoNoValidado exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMensaje());
	}

	@ResponseBody
	@ExceptionHandler(value = TipoDocumentoNoExiste.class)
	public ResponseEntity<?> handleException(TipoDocumentoNoExiste exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("Tipo documento " + exception.getMensaje() + " no existe");
	}
}
