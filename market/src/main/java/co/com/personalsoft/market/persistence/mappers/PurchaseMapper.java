package co.com.personalsoft.market.persistence.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import co.com.personalsoft.market.domain.viewmodel.Purchase;
import co.com.personalsoft.market.persistence.models.Compra;

@Mapper(componentModel = "spring",uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
			@Mappings({ @Mapping(source = "idCompra", target = "purchaseId"),
			@Mapping(source = "idCliente", target = "clientId"), 
			@Mapping(source = "comentario", target = "comment"),
			@Mapping(source = "fecha", target = "date"),
			@Mapping(source = "medioPago", target = "paymentMethod"), 
			@Mapping(source = "estado", target = "state"),
			@Mapping(source = "productos", target = "items")

	})
	Purchase toPurchase(Compra compra);
			
	List<Purchase> toPurchases(List<Compra> compras);

	@InheritInverseConfiguration
	@Mappings({
	@Mapping(target = "cliente", ignore = true)
	})
	Compra toCompra(Purchase purchase);



}
