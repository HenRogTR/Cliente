package pe.com.cliente.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClienteDto {
	@NotNull(message = "Nombre no debe ser nulo o vacío")
	@NotEmpty(message = "Nombre no debe ser nulo o vacío")
	private String nombres;

	@NotNull(message = "Apellidos no debe ser nulo o vacío")
	@NotEmpty(message = "Apellidos no debe ser nulo o vacío")
	private String apellidos;

	@NotNull(message = "Tipo documento no debe ser nulo o vacío")
	@NotEmpty(message = "Tipo documento no debe ser nulo o vacío")
	private String tipoDocumento;

	@NotNull(message = "Número documento no debe ser nulo o vacío")
	@NotEmpty(message = "Número documento no debe ser nulo o vacío")
	private String numeroDocumento;
}
