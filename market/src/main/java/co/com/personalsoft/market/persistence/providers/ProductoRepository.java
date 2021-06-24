package co.com.personalsoft.market.persistence.providers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.personalsoft.market.domain.repositories.ProductRepository;
import co.com.personalsoft.market.domain.viewmodel.Product;
import co.com.personalsoft.market.persistence.mappers.ProductMapper;
import co.com.personalsoft.market.persistence.repositories.ProductoJpaRepository;
@Repository
public class ProductoRepository implements ProductRepository{
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductoRepository.class);
	private final ProductoJpaRepository repository;

	/*public ProductoRepository() {
		this.repository = null;
		this.mapper = null;
		LOGGER.error("ProductoRepository()");
	}
*/
	/*public ProductoRepository(ProductoJpaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Product>> getByCategory(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Product>> getScarceProducts(int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getOne(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long productId) {
		// TODO Auto-generated method stub
		
	}
}*/
	@Autowired
	ProductMapper mapper;

	public ProductoRepository(ProductoJpaRepository repository) {
		this.repository = repository;
		
		LOGGER.error("ProductoRepository(m,r)");
	}

	@Override
	public List<Product> getAll() {
		return mapper.toProducts(repository.findAll());
	}

	@Override
	public Optional<List<Product>> getByCategory(long categoryId) {
		return Optional.of(mapper.toProducts(repository.findByIdCategoriaOrderByNombreAsc(categoryId)));
	}

	@Override
	public Optional<List<Product>> getScarceProducts(int quantity) {
		return repository.findByCantidadStockLessThanAndEstado(quantity, true)
				.map(mapper::toProducts);
	}

	@Override
	public Product save(Product product) {
		
		return mapper.toProduct(repository.save(mapper.toProducto(product)));
	}

	@Override
	public Product getOne(long productId) {
		
		return mapper.toProduct(repository.findById(productId).orElse(null));
	}

	@Override
	public void delete(long productId) {
		repository.deleteById(productId);
		
	}
	
	
}
