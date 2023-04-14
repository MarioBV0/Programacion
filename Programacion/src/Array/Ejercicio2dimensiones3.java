package Array;

import java.util.Scanner;

public class Ejercicio2dimensiones3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int tri = 0;
		int baj = 0;
		
		
		
		
		System.out.println("De que tamaño quieres las filas?");
		tri = sc.nextInt();
		
		System.out.println("De que tamaño quieres las columnas?");
		baj = sc.nextInt();
		
		int matriz1[][]=new int[tri][baj];
		int matriz2[][]=new int[tri][baj];
		
		rellenar(matriz1);		
	}
		
		public static void rellenar(int[][] matriz1) {
			
			 for (int n=0;n<matriz1.length;n++) {
				 for (int i=0;i<matriz1.length;i++) {
					 
					 matriz1[n][i]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
					 
					 System.out.print(matriz1[n][i]);
				 }
			 }


	}

}
