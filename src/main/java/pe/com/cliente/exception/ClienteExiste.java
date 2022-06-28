package pe.com.cliente.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClienteExiste extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String mensaje;

}
