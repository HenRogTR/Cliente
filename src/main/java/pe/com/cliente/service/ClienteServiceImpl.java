package pe.com.cliente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cliente.canonical.Cliente;
import pe.com.cliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> buscarPorCodigoUnico(String codigoUnico) {

		List<Cliente> listaClienteReturn = new ArrayList<>();
		clienteRepository.findByCodigoUnico(codigoUnico).forEach(
				k -> listaClienteReturn.add(Cliente.builder().nombres(k.getNombres()).apellidos(k.getApellidos())
						.tipoDocumento(k.getTipoDocumento()).numeroDocumento(k.getNumeroDocumento()).build()));
		return listaClienteReturn;
	}

}
