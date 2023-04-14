package Abstracción;

public abstract class Empleados {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	
private final static int PLUS=300;

abstract boolean plus();


public Empleados(String nombre, int edad, double salario) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.salario = salario;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


public static int getPlus() {
	return PLUS;
}


@Override
public String toString() {
	return "Empleados [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
}











	


}
