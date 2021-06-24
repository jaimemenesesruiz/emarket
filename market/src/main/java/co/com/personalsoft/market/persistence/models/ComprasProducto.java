package co.com.personalsoft.market.persistence.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="compras_productos")
public class ComprasProducto {
	@EmbeddedId
	private ComprasProductoPK id;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
	@Column(name="total")
	@Size(max=100)
	private Double total;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@MapsId("idCompra")
	@JoinColumn(name="id_compra", updatable=false, insertable = false)
	private Compra compra;
	
	@ManyToOne
	@JoinColumn(name="id_producto", updatable=false, insertable = false)
	private Producto producto;
	
}
