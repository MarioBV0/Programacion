package Electrodomesticos;

public class Electrodomesticos {
	
	protected double preciobase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	
	
	protected final static String color_def="Blanco";
	protected final static char consu_def='F';
	protected final static double precio_def=100;
	protected final static double peso_def=5;
	
	String colores[]= {"blanco","negro","rojo","azul","gris"};	
	
	
	public Electrodomesticos() {
		this.preciobase=precio_def;
		this.consumo=consu_def;
		this.peso=peso_def;
		this.color=color_def;
		

	}



	public Electrodomesticos(double preciobase, double peso) {
		this.preciobase = preciobase;
		this.peso = peso;
		this.color=color_def;
		this.consumo=consu_def;
		
	}


	public Electrodomesticos(double preciobase, String color, char consumo, double peso) {
		
		this.preciobase = preciobase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}



	public double getPreciobase() {
		return preciobase;
	}



	


	public String getColor() {
		return color;
	}



	



	public char getConsumo() {
		return consumo;
	}



	



	public double getPeso() {
		return peso;
	}




	
	
	public void comprobarConsumoEnergetico() {
		
		if (color.equals("blanco")){
			
			
		}
		
	}
	
	public void comprobarColor() {
		
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")){
			
			
		}else {
			color.equals(color_def);
		}
		
		
	}
	
	public double precioFinal() {
		
		double dinero = 0;
		return dinero;
		
	}
	
	
	
	
	
	
	
	
	
	

}
