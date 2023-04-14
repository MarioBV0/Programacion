package Comida;

public class NoPerecedero extends Productos{
	
	private String tipo;
	
	public NoPerecedero(String nombre, double precio, Tipos arroz) {
		super(nombre, precio);
		this.tipo=tipo;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

public enum Tipos {
	ARROZ, PASTA, LEGUMBRES, SOPAS
}

	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}
	


}
