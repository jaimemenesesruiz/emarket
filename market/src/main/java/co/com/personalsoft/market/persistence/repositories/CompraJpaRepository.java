package co.com.personalsoft.market.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.personalsoft.market.persistence.models.Cliente;
import co.com.personalsoft.market.persistence.models.Compra;

public interface CompraJpaRepository  extends JpaRepository<Compra,Long>{
	Optional<List<Compra>> findByIdCliente(Long idCliente);
}
