package co.com.personalsoft.market.persistence.repositories;



import co.com.personalsoft.market.persistence.models.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaJpaRepository extends JpaRepository<Categoria,Long> {

}
