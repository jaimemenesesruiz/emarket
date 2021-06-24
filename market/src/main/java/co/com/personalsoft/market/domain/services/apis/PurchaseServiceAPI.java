package co.com.personalsoft.market.domain.services.apis;

import java.util.List;
import java.util.Optional;

import co.com.personalsoft.market.domain.viewmodel.Purchase;
import co.com.personalsoft.market.shared.generated.GenericServiceAPI;

public interface PurchaseServiceAPI  extends GenericServiceAPI<Purchase,Long>{
	Optional<List<Purchase>> getByClient(Long clientId);
}
