package co.com.personalsoft.market.persistence.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long idProducto;
	
	@Column(name="nombre")
	@Size(max=45)
	private String nombre;
		
	@Column(name="id_categoria")
	private Long idCategoria;
	
	@Column(name="codigo_barras")
	@Size(max=100)
	private String codigoBarras;
	
	@Column(name="precio_venta")
	@Size(max=100)
	private String precioVenta;
	
	
	@Column(name="cantidad_stock")
	@Size(max=100)
	private String cantidadStock;
	
	@Column(name="estado")
	@Size(max=100)
	private String estado;

	
	@ManyToOne
	@JoinColumn(name="id_categoria", insertable = false, updatable = false)
	private Categoria categoria;
}
