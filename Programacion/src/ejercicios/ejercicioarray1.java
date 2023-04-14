package ejercicios;

import java.util.Scanner;

public class ejercicioarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lista[]=new int[10];
		rellenarArray(lista);
		mostrarArray(lista);
	}
		
		
		
		public static void rellenarArray(int lista[]) {
			Scanner sc = new Scanner(System.in);
			
			for(int i=0;i<lista.length;i++) {
				System.out.println("Introduce un numero ");
				int num = sc.nextInt();
				lista[i] = num;
			}
		    sc.close();
		    
		    	
		    }
		public static void mostrarArray(int lista[]) {
			for(int i=0;i<lista.length;i++) {
				System.out.println("En el indice " +(i)+" esta el valor "+lista[i] );
			}
			}
		
		    
		    
		}
	


