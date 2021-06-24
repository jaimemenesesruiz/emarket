package co.com.personalsoft.market.persistence.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name="nombre")
	@Size(max=40)
	private String nombre;
	
	@Column(name="apellido")
	@Size(max=100)
	private String apellido;
	
	@Column(name="celular")
	private Long celular;
	
	@Column(name="direccion")
	@Size(max=80)
	private String direccion;
	
	
	@Column(name="correo_electronico")
	@Size(max=70)
	@Email
	private String correoElectronico;
	
	@OneToMany(mappedBy = "cliente")
	private List<Compra> compras;
	
	

	
}
