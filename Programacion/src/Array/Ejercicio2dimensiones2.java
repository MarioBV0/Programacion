package Array;

import java.util.Scanner;

public class Ejercicio2dimensiones2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int suma=0;
		
		
		
		System.out.println("¿De qué tamaño quieres las columnas del array?");
		num=sc.nextInt();
		
		int matriz[][]=new int[5][num];
		
		 for (int n=0;n<matriz.length;n++) {
			 for (int i=0;i<num;i++) {
				 
				 matriz[n][i]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
				 
				 
				 System.out.print(matriz[n][i]+" ");
				 
				 System.out.print("("+n+","+i+")"+matriz[n][i]+" ");
	                suma=suma+matriz[n][i];
				 
				 
			 }
		System.out.println("");
		
		System.out.println(suma);
		

	}
	
		 
	
		 
	}
}
