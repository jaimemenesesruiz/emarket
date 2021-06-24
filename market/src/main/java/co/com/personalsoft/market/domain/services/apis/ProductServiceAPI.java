package co.com.personalsoft.market.domain.services.apis;

import java.util.List;
import java.util.Optional;

import co.com.personalsoft.market.domain.viewmodel.Product;
import co.com.personalsoft.market.shared.generated.GenericServiceAPI;

public interface ProductServiceAPI extends GenericServiceAPI<Product,Long> {
	Optional<List<Product>> getByCategory(long categoryId);

	Optional<List<Product>> getScarceProducts(int quantity);
}
