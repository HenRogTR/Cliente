package pe.com.cliente.canonical;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Cliente {
	private String nombres;

	private String apellidos;

	private String tipoDocumento;

	private String numeroDocumento;
}
