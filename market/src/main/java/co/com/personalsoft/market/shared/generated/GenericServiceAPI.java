package co.com.personalsoft.market.shared.generated;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<E, ID extends Serializable> {
	
	E save(E entity);

	void delete(ID id);

	E getOne(ID id);

	List<E> getAll();
}
