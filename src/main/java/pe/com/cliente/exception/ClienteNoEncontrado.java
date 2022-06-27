package pe.com.cliente.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClienteNoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String mensaje;

}
