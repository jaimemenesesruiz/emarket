package co.com.personalsoft.market.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.personalsoft.market.persistence.models.Cliente;

public interface ClienteJpaRepository  extends JpaRepository<Cliente,Long>{

}
