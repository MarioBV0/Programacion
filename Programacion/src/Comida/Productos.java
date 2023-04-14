package Comida;

public class Productos {
	
	protected String nombre;
	protected double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcular(int cantidad) { 
		return cantidad*precio;
	}
	
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	

}
