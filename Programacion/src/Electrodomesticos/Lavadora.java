package Electrodomesticos;

public class Lavadora extends Electrodomesticos {
	
	protected double carga;
	
	protected final static double carga_def=5;

	public Lavadora() {
		
	}

	public Lavadora(double carga,double preciobase) {
		this.peso = peso;
		this.carga = carga;
		this.preciobase= preciobase;
		this.consumo=consu_def;
		this.color=color_def;
		
	}

	public Lavadora(double carga) {
		
		this.carga = carga;
		super.color = color;
		super.peso=peso;
		super.consumo=consumo;
		super.preciobase=preciobase;
		
	}

	public double getCarga() {
		return carga;
	}

public void PrecioFinal() {
	super.precioFinal();
	
	if(carga>30) {
		
		preciobase = preciobase + 50;
		
	}else {
		
	}
		
}
	
	
	
	
	
	
	
	
	

}
