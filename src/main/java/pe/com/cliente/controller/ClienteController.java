package pe.com.cliente.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cliente.canonical.Cliente;
import pe.com.cliente.service.ClienteService;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/cliente/{codigoUnico}")
	public ResponseEntity<Object> buscarXCodigo(@PathVariable("codigoUnico") String codigoUnico,
			HttpServletResponse response) {

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		Cliente cliente = clienteService.buscarXCodigoUnico(codigoUnico);

		return cliente == null ? new ResponseEntity<Object>(HttpStatus.NOT_FOUND)
				: new ResponseEntity<Object>(cliente, HttpStatus.OK);

		// TODO establecer profile en container
	}

}
