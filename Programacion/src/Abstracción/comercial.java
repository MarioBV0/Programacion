package Abstracción;

public class comercial extends Empleados {
	
	
	private double comision;
	
	public comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.comision = comision;
	}

	

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}



	@Override
	boolean plus() {
		if(this.edad > 30 & this.comision==300) {
			
		return true;
			
		}
		return false;
	}
	
	
	
	

}
