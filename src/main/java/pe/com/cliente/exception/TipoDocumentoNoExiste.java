package pe.com.cliente.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumentoNoExiste extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String mensaje;

}
