package co.com.personalsoft.market.persistence.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="categorias")
@Data
public class Categoria {
	@Id
	@Column(name="id_categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@Column(name="descripcion")
	@Size(max=100)
	private String descripcion;
	
	@Column
	private Boolean estado;
	
	@OneToMany(mappedBy="categoria")
	private List<Producto> productos;	
	
	
	

}
