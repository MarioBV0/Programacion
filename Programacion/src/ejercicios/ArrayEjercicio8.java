package ejercicios;

import java.util.Scanner;

public class ArrayEjercicio8 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 

		 
		 System.out.println("¿De que tamaño quieres el array?");
		 
		 int tam=sc.nextInt();
		 
		 System.out.println("¿Que último numero quieres visualizar?");
		 
		 int fin=sc.nextInt();
		 
		 int array1[]= new int[tam];
		 
		 rellenarArray(array1);
		 numerofin(array1,fin);
	}
		 
		 
		 public static int[] rellenarArray(int array1[]) {
			 for (int n=0;n<array1.length;n++) {
	             array1[n]=(int) Math.floor(Math.random()*(300 -0 +1) +0 );
	             

	}
			return array1;

}
		 
	public static void numerofin (int array1[],int fin) {
		 for (int n=0;n<array1.length;n++) {
			int num = array1[n]%10;
			
			if (fin==num) {
				System.out.println(num);
				
			}
		 }
	}
		 
}