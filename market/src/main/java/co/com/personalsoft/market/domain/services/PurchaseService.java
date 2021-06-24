package co.com.personalsoft.market.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.personalsoft.market.domain.repositories.PurchaseRepository;
import co.com.personalsoft.market.domain.services.apis.PurchaseServiceAPI;
import co.com.personalsoft.market.domain.viewmodel.Purchase;

@Service
public class PurchaseService implements PurchaseServiceAPI{
	private final PurchaseRepository repository;

	public PurchaseService(PurchaseRepository repository) {
		this.repository = repository;
	}

	@Override
	public Purchase save(Purchase entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
		
	}

	@Override
	public Purchase getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public List<Purchase> getAll() {
		return repository.getAll();
	}

	@Override
	public Optional<List<Purchase>> getByClient(Long clientId) {
		return repository.getByClient(clientId);
	}

}
