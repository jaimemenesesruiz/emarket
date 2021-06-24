package co.com.personalsoft.market.persistence.providers;

import org.springframework.stereotype.Repository;

import co.com.personalsoft.market.persistence.repositories.CategoriaJpaRepository;

@Repository
public class CategoriaRepository {
	private final CategoriaJpaRepository repository;

	public CategoriaRepository(CategoriaJpaRepository repository) {
		this.repository = repository;
	}
	
	
}
