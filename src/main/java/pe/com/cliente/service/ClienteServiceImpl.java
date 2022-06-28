package pe.com.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cliente.canonical.Cliente;
import pe.com.cliente.exception.ClienteExiste;
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

	@Override
	public void actualizarXCodigoUnico(String codigoUnico, Cliente cliente) {
		pe.com.cliente.model.Cliente clienteMod = clienteRepository.findByCodigoUnico(codigoUnico);

		if (clienteMod == null) {
			throw new ClienteNoEncontrado("Cliente " + codigoUnico + " no existente");
		}
		pe.com.cliente.model.Cliente clienteDocumento = clienteRepository.findByTipoDocumentoAndNumeroDocumentoAndIdNot(
				cliente.getTipoDocumento(), cliente.getNumeroDocumento(), clienteMod.getId());

		if (clienteDocumento != null) {

			throw new ClienteExiste();
		}

		clienteMod.setNombres(cliente.getNombres());
		clienteMod.setApellidos(cliente.getApellidos());
		clienteMod.setTipoDocumento(cliente.getTipoDocumento());
		clienteMod.setNumeroDocumento(cliente.getNumeroDocumento());

		clienteRepository.save(clienteMod);

	}

}
