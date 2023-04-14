package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		int numse=(int) Math.floor(Math.random()*(999 -0 +0) +0 );
		
		int tri=0;
		
		int num=0;
		
		
		do {
		System.out.println("==Introduce el numero"
				+ "==");
		num=sc.nextInt();
		
		tri = tri + 1;
		
		
		if(num > numse) {
			
			System.out.println("El numero secreto es mas PEQUEÑO");
			
		}
		
if(num < numse) {
			
			System.out.println("El numero secreto es mas GRANDE");
			
		}


if(tri == 9) {
	
	System.out.println("Este es el ultimo INTENTO");
	
}

if(num == numse) {
	
	System.out.println("ENORABUENA EL NUMERO INTRODUCIDO ES CORRECTO!!");
	
	break;
	
}

if(tri == 10) {
	
	System.out.println("LO SIENTO EL NUMERO DE INTENTOS HA TERMINADO, EL NUMERO SECRETO ERA EL "+numse);
	
	break;
	
}
		
		}while(tri < 10 || num == numse);
		

	}
	
	

}
