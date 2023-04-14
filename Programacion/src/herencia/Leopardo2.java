package herencia;

public class Leopardo2 extends Animales1 {
	
	public Leopardo2() {
		super();
		
			System.out.println("== LEOPARDO ==");
		
	}

	
	public void correr() {
		System.out.println("Corre");
	}
	
	public void Ruge() {
		System.out.println("Ruge");
	}
	
	public void reproducirse() {
		System.out.println("Reprodicirse en leopardo");
		super.reproducirse();
	}
}


