package pe.com.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cliente.dto.ClienteDto;
import pe.com.cliente.exception.ClienteExiste;
import pe.com.cliente.exception.ClienteNoEncontrado;
import pe.com.cliente.model.Cliente;
import pe.com.cliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public ClienteDto buscarXCodigoUnico(String codigoUnico) {

		Cliente cliente = clienteRepository.findByCodigoUnico(codigoUnico);

		if (cliente == null) {
			throw new ClienteNoEncontrado("Cliente " + codigoUnico + " no existente");
		}
		return ClienteDto.builder().nombres(cliente.getNombres()).apellidos(cliente.getApellidos())
				.tipoDocumento(cliente.getTipoDocumento()).numeroDocumento(cliente.getNumeroDocumento()).build();

	}

	@Override
	public void actualizarXCodigoUnico(String codigoUnico, ClienteDto cliente) {
		Cliente clienteMod = clienteRepository.findByCodigoUnico(codigoUnico);

		if (clienteMod == null) {
			throw new ClienteNoEncontrado("Cliente " + codigoUnico + " no existente");
		}
		Cliente clienteDocumento = clienteRepository.findByTipoDocumentoAndNumeroDocumentoAndIdNot(
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
