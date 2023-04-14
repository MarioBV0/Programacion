package Barajas;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		
		Baraja b = new Baraja();
		
		 Scanner sc = new Scanner(System.in);
		 
		 int num = 0;
		 
		 do {
			 
		System.out.println("");
		
		System.out.println("1. Muestra el numero de cartas disponibles");
		System.out.println("2. Muestra las cartas");
		System.out.println("3. Muestra monton");
		System.out.println("4. da carta");
		System.out.println("5. Barajar");
		num=sc.nextInt();
		
		if (num == 1) {
			System.out.print(b.cartasDisponibles());
			
		}
		if (num == 2) {
			b.mostrarBaraja();
			
		}
		if (num == 3) {
			b.cartasMonton();
			
		}
		
		if (num == 4) {
			b.darCartas(2);
			
		}
		
		if (num == 5) {
			b.barajar();
			
		}
		
		
	
	}while (num != 6);

}
}
