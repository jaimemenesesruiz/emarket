package co.com.personalsoft.market.persistence.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import co.com.personalsoft.market.domain.viewmodel.Category;
import co.com.personalsoft.market.persistence.models.Categoria;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	@Mappings({ 
			@Mapping(source = "idCategoria", target = "categoryId"),
			@Mapping(source = "descripcion", target = "categoryName"), 
			@Mapping(source = "estado", target = "active")

	})
	Category toCategory(Categoria categoria);

	@InheritInverseConfiguration
	@Mapping(target = "productos", ignore = true)


	Categoria toCategoria(Category category);

}
