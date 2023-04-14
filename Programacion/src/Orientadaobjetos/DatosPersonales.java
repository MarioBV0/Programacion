package Orientadaobjetos;

import java.util.Date;

public	class DatosPersonales{
	
	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String string) {
		this.fechaNacimiento = string;
	}

	private String nombre;
	private String Apellidos;
	private String fechaNacimiento;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public DatosPersonales() {
		super();
		System.out.println("== CONSTRUCTOR ==");
		this.nombre="Vinicius";
		this.Apellidos="Junior";
		this.fechaNacimiento="22/02/2023";
		
	}
}



