package co.com.personalsoft.market.domain.repositories;

import java.util.List;
import java.util.Optional;

import co.com.personalsoft.market.domain.viewmodel.Purchase;

public interface PurchaseRepository {
	List<Purchase> getAll();

	Optional<List<Purchase>> getByClient(long clientId);

	Purchase save(Purchase purchase);

	Purchase getOne(long purchaseId);

	void delete(long purchaseId);
}
