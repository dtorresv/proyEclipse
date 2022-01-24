package com.ejemplocrud.ejemplocrud.modelo;

import javax.persistence.*;

@Entity
@Table(name="Trabajador")
public class Trabajador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTrabjador;
	
	@Column(name ="nombre", nullable= false,length = 70)
	private String nombre;
	
	@Column(name="apellidos",nullable= false, length= 150)
	private String apellidos;
	
	@Column(name="direccion", nullable= true, length = 150)
	private String direccion;
	
	@Column(name="telefono", nullable = true, length = 9)
	private String telefono;
	
	@Column(name="email", nullable = true, length = 55)
	private String email;

	public Integer getIdTrabjador() {
		return idTrabjador;
	}

	public void setIdTrabjador(Integer idTrabjador) {
		this.idTrabjador = idTrabjador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajador(Integer idTrabjador, String nombre, String apellidos, String direccion, String telefono,
			String email) {
		super();
		this.idTrabjador = idTrabjador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}	
}
