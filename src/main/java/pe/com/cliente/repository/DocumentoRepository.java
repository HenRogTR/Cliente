package pe.com.cliente.repository;

import org.springframework.data.repository.CrudRepository;

import pe.com.cliente.model.Documento;

public interface DocumentoRepository extends CrudRepository<Documento, Long> {

	Documento findByTipo(String tipo);

}
