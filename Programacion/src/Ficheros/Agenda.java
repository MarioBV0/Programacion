package Ficheros;

import java.io.Serializable;

public class Agenda implements Serializable{
	
	private String nombre;
	private String apellidos;
	private String tlf;
	private String email;
	private String fecha;
	
	
	public Agenda(String nombre, String apellidos, String tlf, String email, String fecha) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tlf = tlf;
		this.email = email;
		this.fecha = fecha;
	}


	public Agenda() {
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


	public String getTlf() {
		return tlf;
	}


	public void setTlf(String tlf) {
		this.tlf = tlf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + ", apellidos=" + apellidos + ", tlf=" + tlf + ", email=" + email
				+ ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
