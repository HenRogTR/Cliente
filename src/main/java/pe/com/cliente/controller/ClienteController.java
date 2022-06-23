package pe.com.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cliente.canonical.Cliente;
import pe.com.cliente.service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/cliente/{codigoUnico}")
	public List<Cliente> buscarXCodigo(@PathVariable("codigoUnico") String codigoUnico) {
		return clienteService.buscarPorCodigoUnico(codigoUnico);
	}

}
