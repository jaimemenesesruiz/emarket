package co.com.personalsoft.market.web.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.personalsoft.market.domain.services.apis.ProductServiceAPI;
import co.com.personalsoft.market.domain.viewmodel.Product;
import co.com.personalsoft.market.shared.generated.GenericRestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/products")
@Api(tags = "Products")
public class ProductRestController extends GenericRestController<Product,Long>{
private ProductServiceAPI serviceApi;
	public ProductRestController(ProductServiceAPI serviceAPI) {
		super(serviceAPI);
		this.serviceApi=serviceAPI;
	}
	@PostMapping("/category/{id}")
    @ApiOperation(
            value = "obtiene todos los productos por categoria",
            notes = "Servicio para listas todos los productos por categoria"//,
            //authorizations = {@Authorization(value="jwtToken")}
            )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Entidad listada correctamente"),
            @ApiResponse(code = 401, message = "Usuario no autorizado"),
            @ApiResponse(code = 403, message = "Solicitud prohibida por el servidor"),
            @ApiResponse(code = 404, message = "Entidad no encontrada")
    })
	public ResponseEntity<List<Product>> getByCategory(@PathVariable("id") long categoryId){
		return serviceApi.getByCategory(categoryId)
				.map(products->ResponseEntity.ok().body(products)
						).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/scarse/{id}")
	public ResponseEntity<List<Product>> getScarseProducts(@PathVariable("id") int quantity){
		return serviceApi.getScarceProducts(quantity)
				.map(products->ResponseEntity.ok().body(products)
						).orElse(ResponseEntity.notFound().build());
	}
	
	
}

