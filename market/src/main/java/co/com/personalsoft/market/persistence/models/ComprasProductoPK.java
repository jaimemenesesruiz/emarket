package co.com.personalsoft.market.persistence.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ComprasProductoPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

@Column(name="id_compra")
private Long idCompra;

@Column(name="id_producto")
private Long idProducto;


}
