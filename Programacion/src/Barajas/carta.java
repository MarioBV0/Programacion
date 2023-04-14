package Barajas;

public class carta {
	
	private int numero;
	private String palo;
	
	
	public static final String[] PALOS={"espadas", "oros", "copas", "bastos"};
	 public static final int lim = 10;
	 
	 public carta(int numero, String palo) {
		 this.numero = numero;
		 this.palo = palo;
		 
	 }

	
	public String toString() {
		return "carta [numero=" + numero + ", palo=" + palo + "]";
	}
	 
	 
	 
	
	
	
	
	

}
