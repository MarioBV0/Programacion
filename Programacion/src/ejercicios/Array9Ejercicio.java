package ejercicios;

import java.util.Scanner;

public class Array9Ejercicio {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 char Letra[]= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		 
		 
		 System.out.println("¿Cual es el DNI?");
		 
		 int dni=sc.nextInt();
		 
	
			 
			int res = (dni%23);
			
			System.out.println("Tu resultado es "+res);
		 
		 
			char letriux=Letra[res];
			 				
			 				
			 		String dnis= String.valueOf(dni);

			
			
			 
			 System.out.println("Su DNI es "+dnis + letriux);
			 
			 
			 System.out.println("Introduce tu DNI con letra");
			 int dni2=sc.nextInt();
			 
			 
			 
			 
			 
			 
			 
			 
			 
				 
				 
				 
			 
		 
		 
	}
}

		 

	


