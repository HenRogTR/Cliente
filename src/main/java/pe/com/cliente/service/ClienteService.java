package pe.com.cliente.service;

import pe.com.cliente.dto.ClienteDto;

public interface ClienteService {
	ClienteDto buscarXCodigoUnico(String codigoUnico);

	void actualizarXCodigoUnico(String codigoUnico, ClienteDto cliente);
}
