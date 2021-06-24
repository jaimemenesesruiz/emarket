package co.com.personalsoft.market.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.personalsoft.market.persistence.models.Producto;

public interface ProductoJpaRepository  extends JpaRepository<Producto,Long>{
	
	List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);
	//@Query("select op from producto p where  p.cantidadStock<?1 and p.estado")
	Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad, Boolean estado);
}
