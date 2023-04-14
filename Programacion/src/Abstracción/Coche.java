package Abstracción;

public class Coche extends Vehiculo {



	@Override
	public void acelerar() {
		velocidad+=5;
		
	}

	@Override
	public void frenar() {
		velocidad=0;
		
	}

}
