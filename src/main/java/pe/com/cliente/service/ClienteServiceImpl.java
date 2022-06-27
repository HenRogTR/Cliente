package pe.com.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cliente.canonical.Cliente;
import pe.com.cliente.exception.ClienteNoEncontrado;
import pe.com.cliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente buscarXCodigoUnico(String codigoUnico) {

		pe.com.cliente.model.Cliente cliente = clienteRepository.findByCodigoUnico(codigoUnico);

		if (cliente == null) {
			throw new ClienteNoEncontrado("Cliente " + codigoUnico + " no existente");
		}
		return Cliente.builder().nombres(cliente.getNombres()).apellidos(cliente.getApellidos())
				.tipoDocumento(cliente.getTipoDocumento()).numeroDocumento(cliente.getNumeroDocumento()).build();

	}

}
