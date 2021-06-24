package co.com.personalsoft.market.domain.repositories;

import java.util.List;
import java.util.Optional;

import co.com.personalsoft.market.domain.viewmodel.Product;

public interface ProductRepository {
	List<Product> getAll();

	Optional<List<Product>> getByCategory(long categoryId);

	Optional<List<Product>> getScarceProducts(int quantity);

	Product save(Product product);

	Product getOne(long productId);

	void delete(long productId);
}
