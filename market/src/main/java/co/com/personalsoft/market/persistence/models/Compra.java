package co.com.personalsoft.market.persistence.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="compras")
public class Compra {
	@Id
	@Column(name="id_compra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompra;
	
	@Column(name="id_cliente")
	private Long idCliente;

	@Column(name="fecha")
	private LocalDateTime fecha;
	
	@Column(name = "medio_pago")
	@Size(max=1)
	private String medioPago;
	
	@Size(max=300)
	@Column(name="comentario")
	private String comentario;
	
	@Size(max=1)
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_cliente",insertable=false, updatable=false)
	private Cliente cliente;
	
	@OneToMany(mappedBy="compra",cascade=CascadeType.ALL)
	private List<ComprasProducto> productos;
}
