package pe.com.cliente.service;

import java.util.List;

import pe.com.cliente.canonical.Cliente;

public interface ClienteService {
	List<Cliente> buscarPorCodigoUnico(String codigoUnico);
}
