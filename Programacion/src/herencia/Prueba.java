package herencia;

import ejercicios.Animales1;

public class Prueba {

	public static void main(String[] args) {
		
		Animales1 animal = new Animales1();
		
animal.crecer();
animal.reproducirse();
animal.respirar();
		
		
		System.out.println();
		
		
		Leopardo leopardo = new Leopardo();
		leopardo.correr();
		leopardo.Ruge();
		
	}

}
