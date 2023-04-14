package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		int prim[]=new int[6];
		int gan[]=new int[6];
		
		
		int num= 0;
		int rei= 0;
		int rei2= 0;
		int com= 0;
		int cont= 0;
		
		rellenarArray(prim,num);
		ganadora(gan,com);
		mostrar(gan,prim,com,rei,rei2,cont);
		
			
	}
	
	
	public static void rellenarArray(int prim[], int num) {
		
		Scanner sc = new Scanner(System.in);
		
		 for (int n=0;n<prim.length;n++) {
		
		System.out.println("==Introduce los numeros deseados para la apuesta==");
		 num=sc.nextInt();
		 
		 
		 
if(num == prim[0] || num == prim[1] || num == prim[2]|| num == prim[3]|| num == prim[4]|| num == prim[5]) {
			 
			 System.out.println("NO SE PUEDE REPETIR LOS NUMEROS!!");
			 
			 System.exit(0);
			
			 
		 }
		 
		 
if(num < 1) {
			 
			 System.out.println("NO SE PUEDE INTRODUCIR UN NUMERO MENOR A 1!!");
			 
			 System.exit(0);
			 
		 }

if(num > 49) {
	 
	 System.out.println("NO SE PUEDE INTRODUCIR UN NUMERO SUPERIOR A 49!!");
	 
	 System.exit(0);
	 
}
		
		prim[n]=num;
		
		 }
		 
		
	 }
	 
		 public static void ganadora(int gan[],int com) {
			 for (int n=0;n<gan.length;n++) {
				 
				 gan[n]=(int) Math.floor(Math.random()*(49 -1 +0) +1 );
			 
			 }	 
		 } 
		 
		 public static void mostrar(int gan[],int prim[],int com, int rei, int rei2,int cont) {
			 for (int n=0;n<gan.length;n++) {
				 
				 Arrays.sort(gan);
				 
				 System.out.print(+gan[n]+" ");
				 
			 }
			 
			 
			 
			 System.out.println("");
			 
			 com=(int) Math.floor(Math.random()*(49 -1 +0) +1 );
			 System.out.println("El numero complementario es el "+com);
			 
			 rei2=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
			  System.out.println("Cuyo reintegro es el "+rei2);
			  System.out.println("");
			  System.out.println("==============================");
			 
			 
			 
			 for (int n=0;n<prim.length;n++) {
				 
				 System.out.print(prim[n]+" ");
				 
				 if(gan[n]==prim[n] || rei == rei2) {
					 
					cont++;
					 
				 }
				
				 
			 }
			 
			 System.out.println("");
			 
			 rei=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
			 System.out.println("Cuyo reintegro es el "+rei);
			 
			 System.out.println("La cantidad de numeros que se han repetido son "+cont);
			 
			 
			 
			 
			 
			
				 
			 
			  }
		 
		 
		
	}


