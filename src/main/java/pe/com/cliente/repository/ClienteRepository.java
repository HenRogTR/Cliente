package pe.com.cliente.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pe.com.cliente.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

	Cliente findByCodigoUnico(@Param("codigo_unico") String codigoUnico);

	Cliente findByDocumentoTipoAndNumeroDocumentoAndIdNot(@Param("tipo_documento") String tipoDocumento,
			@Param("numero_documento") String numeroDocumento, @Param("id") Long id);
}
