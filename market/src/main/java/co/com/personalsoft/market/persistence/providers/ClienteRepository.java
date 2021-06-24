package co.com.personalsoft.market.persistence.providers;

import org.springframework.stereotype.Repository;

import co.com.personalsoft.market.persistence.repositories.ClienteJpaRepository;
@Repository
public class ClienteRepository {
	private final ClienteJpaRepository repository;

	public ClienteRepository(ClienteJpaRepository repository) {
		this.repository = repository;
	}
	
	
}
