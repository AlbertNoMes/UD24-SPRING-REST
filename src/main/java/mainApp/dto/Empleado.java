package mainApp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

	//DEFINIMOS ATRIBUTOS DE CLASE
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // BUSCA ULTIMO VALOR E INCREMENTA DESDE ID FINAL DE DB
	private Long id;
	@Column(name="nombre")
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private Date fecha;
	private String trabajo;
	
	//CONSTRUCTOR DE CLASE
	public Empleado() {
		super();
	}

	public Empleado(Long id, String nombre, String apellido, String direccion, int dni, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}

	//GETTERS & SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
}
