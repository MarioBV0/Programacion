package ejercicios;

import java.util.Arrays;

public class Ejercicio14Arrays {

	public static void main(String[] args) {
		
		int[]array1=new int[10];
		
	
	 
		 for (int n=0;n<array1.length;n++) {
             
			array1[n]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
             System.out.print(array1[n]);
             
             
		 }
		 
		 
		 
		 System.out.println("");
		 
		 for (int n=0;n<array1.length;n++) {
			 Arrays.sort(array1);
             
         System.out.print(array1[n]);
		 }
		 
		 System.out.println("");
	 
		 
		 
		 
		 
	
		 
	
		 
	}
	 }
	 
	 
