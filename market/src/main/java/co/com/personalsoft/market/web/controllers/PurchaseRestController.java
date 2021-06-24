package co.com.personalsoft.market.web.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personalsoft.market.domain.services.apis.PurchaseServiceAPI;
import co.com.personalsoft.market.domain.viewmodel.Purchase;
import co.com.personalsoft.market.shared.generated.GenericRestController;
import io.swagger.annotations.Api;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/purchases")
@Api(tags = "Purchases")
public class PurchaseRestController  extends GenericRestController<Purchase,Long>{
	private final PurchaseServiceAPI serviceAPI;

	public PurchaseRestController(PurchaseServiceAPI serviceAPI) {
		super(serviceAPI);
		this.serviceAPI = serviceAPI;
	}
@GetMapping("/byClient/{id}")
public ResponseEntity<List<Purchase>> getByclient(@PathVariable ("id") long id){
	return serviceAPI.getByClient(id)
			.map(purchases->ResponseEntity.ok().body(purchases))
			.orElse(ResponseEntity.notFound().build());
}
}
