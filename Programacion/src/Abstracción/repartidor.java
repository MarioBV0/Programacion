package Abstracción;

public class repartidor extends Empleados {
	
	private String zona;
	
	public repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre,edad,salario);
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.zona = zona;
	}

	

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}



	@Override
	boolean plus() {
		if(this.edad < 25 & zona.equals("Zona3")) {
			return true;
			
		}
		return false;
	}

	
	
	
	

}
