package co.com.personalsoft.market.shared.generated;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class GenericRestController<E, ID extends Serializable>{

	private final GenericServiceAPI<E, ID> serviceAPI;

	public GenericRestController(GenericServiceAPI<E, ID> serviceAPI) {
		
		this.serviceAPI = serviceAPI;
	}
	
	
	// Validator de campos
	public ResponseEntity<?> validar(BindingResult result) {
		Map<String, Object> errors = new HashMap<>();
		result.getFieldErrors().forEach(fieldError -> errors.put(fieldError.getField(),
				"El campo " + fieldError.getField() + " " + fieldError.getDefaultMessage()));
		return ResponseEntity.badRequest().body(errors);
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok().body(serviceAPI.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable ID id) {
		E entity= serviceAPI.getOne(id);
		if(entity==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(entity);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable ID id) {
		E entity= serviceAPI.getOne(id);
		if(entity!=null) {
			serviceAPI.delete(id);
		}
		return new ResponseEntity<>(entity,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@Valid @RequestBody E entity, BindingResult result) {
		
		if(result.hasErrors()) {
			return validar(result);
		}
		return  ResponseEntity.status(HttpStatus.CREATED).body(serviceAPI.save(entity));
	}
	
}
