package Comida;

public class Perecedero extends Productos {
	
	
private int diasacaducar;






	public Perecedero(String nombre, double precio, int diasacaducar) {
	super(nombre, precio);
	this.diasacaducar = diasacaducar;
}

	public int getDiasacaducar() {
		return diasacaducar;
	}

	public void setDiasacaducar() {
		this.diasacaducar = diasacaducar;
	}
	

	
	
	

	public String toString() {
		return "Perecedero [diasacaducar=" + diasacaducar + "]";
	}

	public double calcular(double preciofinal) { 
		
		
		if(diasacaducar == 1) {
			
			 preciofinal=precio/4;
			
		}
		if(diasacaducar == 2) {
			
			 preciofinal=precio/3;
			
		}
		
		if(diasacaducar == 3) {
			
			 preciofinal=precio/1;
			
		}
		
		return preciofinal;
	}
	
	
	
	

}
