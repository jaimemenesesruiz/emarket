package co.com.personalsoft.market.persistence.providers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.com.personalsoft.market.domain.repositories.PurchaseRepository;
import co.com.personalsoft.market.domain.viewmodel.Purchase;
import co.com.personalsoft.market.persistence.mappers.PurchaseMapper;
import co.com.personalsoft.market.persistence.repositories.CompraJpaRepository;
@Repository
public class CompraRepository implements PurchaseRepository{
	private final CompraJpaRepository repository;

	public CompraRepository(CompraJpaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Purchase> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Purchase>> getByClient(long clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Purchase save(Purchase purchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Purchase getOne(long purchaseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long purchaseId) {
		// TODO Auto-generated method stub
		
	}
	
}
	/*private final PurchaseMapper mapper;

	public CompraRepository(CompraJpaRepository repository,PurchaseMapper mapper) {
		this.repository = repository;
		this.mapper=mapper;
	}

	@Override
	public List<Purchase> getAll() {
		return mapper.toPurchases(this.repository.findAll());
	}

	@Override
	public Optional<List<Purchase>> getByClient(long clientId) {
		return repository.findByIdCliente(clientId)
				.map(mapper::toPurchases);
	}

	@Override
	public Purchase save(Purchase purchase) {
		var compra=mapper.toCompra(purchase);
		compra.getProductos().forEach(producto->producto.setCompra(compra));
		return mapper.toPurchase(repository.save(compra));
	}

	@Override
	public Purchase getOne(long id) {
		
		return mapper.toPurchase(repository.getById(id));
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
		
	}
	
	
}
*/