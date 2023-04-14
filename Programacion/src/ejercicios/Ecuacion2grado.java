package ejercicios;

import java.util.Scanner;

public class Ecuacion2grado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto vale A?");
		int a = sc.nextInt();
		
		System.out.println("¿Cuanto vale B?");
		int b = sc.nextInt();
		
		System.out.println("¿Cuanto vale C?");
		int c = sc.nextInt();
		
		System.out.println("");
		
		int resul1 = 0;
		
	resul1 = (int) ((-b)+(Math.sqrt(b*b)-(4*a*c)))/2*a;
		
		System.out.println("El primer resultado de la ecuación es "+resul1);
		
		int resul2 = 0;
		
		resul2 = (int) ((-b)-(Math.sqrt(b*b)-(4*a*c)))/2*a;
			
			System.out.println("El segundo resultado de la ecuación es "+resul2);


	}

}
