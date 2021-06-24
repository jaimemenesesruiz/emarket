package co.com.personalsoft.market.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.personalsoft.market.domain.repositories.ProductRepository;
import co.com.personalsoft.market.domain.services.apis.ProductServiceAPI;
import co.com.personalsoft.market.domain.viewmodel.Product;

@Service
public class ProductService implements ProductServiceAPI {


	private final ProductRepository repository;
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	@Override
	public Product save(Product entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
		
	}

	@Override
	public Product getOne(Long id) {
		
		return repository.getOne(id);
	}

	@Override
	public List<Product> getAll() {
		
		return repository.getAll();
	}

	@Override
	public Optional<List<Product>> getByCategory(long categoryId) {
		return repository.getByCategory(categoryId);
	}

	@Override
	public Optional<List<Product>> getScarceProducts(int quantity) {
		
		return repository.getScarceProducts(quantity);
	}

}
