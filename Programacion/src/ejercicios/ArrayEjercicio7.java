package ejercicios;

import java.util.Scanner;

public class ArrayEjercicio7 {

	public static void main(String[] args) {
		int cont = 0;
		int cont1 = 0;
		int cont2 = 0;
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("¿De que tamaño quieres el array?");
		 
		 int tamarra=sc.nextInt();
		 sc.close();		
		 
		 int array1[]= new int[tamarra];
		 int array2[]= new int[tamarra];
		 int array3[]= new int[tamarra];
		 
		 rellenarArray(array1,array2,array3);
		 System.out.println("");
		 indice(array1,array2,array3,cont,cont1,cont2);
		 
		 
		 
	}
		 
		
	public static int[] rellenarArray(int array1[],int array2[],int array3[]) {
		 for (int n=0;n<array1.length;n++) {
             array1[n]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
            
         
		 
		 for (int i=0;i<array2.length;i++) {
             array2[i]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
             
             
            
            
         
		 
		 for (int j=0;j<array3.length;j++) {
		       array3[j]=array1[j]*array2[j];
		       
		      
		       
		       
		    }
		
		 }
		 }
		return array3;
		
		 
		
		
		
		
		 
	}
	
	

	
	public static void indice(int array1[], int array2[],int array3[], int cont, int cont1, int cont2) {
		 for (int n=0;n<array1.length;n++) {
			 cont = cont + 1;
			 System.out.println("El índice es " +cont+ " y el numero es "+array1[n]);
			 System.out.println("");
		 }
		 
		 for (int i=0;i<array2.length;i++) {
			 cont1 = cont1 + 1;
			 System.out.println("El índice es " +cont1+ " y el numero es "+array2[i]);
			 System.out.println("");
		 }
		 
		 for (int j=0;j<array3.length;j++) {
			 cont2 = cont2 + 1;
			 System.out.println("El índice es " +cont2+ " y el numero es "+array3[j]);
		 }
	}
		 
}	 

	


