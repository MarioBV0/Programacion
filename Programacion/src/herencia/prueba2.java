package herencia;

import ejercicios.Animales1;

public class prueba2 {

	public static void main(String[] args) {
		
		Animales1 animal = new Animales1();
		animal.crecer();
		animal.reproducirse();
		animal.respirar();
		
		Leopardo2 leopardo2 = new Leopardo2();
		leopardo2.correr();
		leopardo2.Ruge();
		
		leopardo2.crecer();
		leopardo2.reproducirse();
		leopardo2.respirar();
		
		Mutacion muta1 = new Mutacion();

		muta1.muta();
		muta1.convirtio();
		muta1.Ruge();

	

	}

}
