package pe.com.cliente.service;

import pe.com.cliente.canonical.Cliente;

public interface ClienteService {
	Cliente buscarXCodigoUnico(String codigoUnico);

	void actualizarXCodigoUnico(String codigoUnico, Cliente cliente);
}
