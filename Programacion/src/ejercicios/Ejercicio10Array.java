package ejercicios;

import java.util.Scanner;

public class Ejercicio10Array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int cont = 1;
		int cont1 = 1;
		
		double array1[]= new double[10];
		String array2[]=new String[10];
		String array3[]=new String[10];
		
		rellenarArray(array1,cont,cont1,array2);
		NotFin(array1,array3);
		MostrarArray(array1,array2,array3);
	}
	
	public static void rellenarArray(double[] array1, int cont, int cont1, String[] array2) {
		for (int n=0;n<array2.length;n++) {
			System.out.println("¿Dime el nombre del alumno "+cont++);
			 array2[n]=sc.nextLine();
		}
		
		for (int n=0;n<array1.length;n++) {
			System.out.println("¿Dime la nota del alumno "+cont1++);
			array1[n]=sc.nextDouble();
			
		}
	}
	
	public static void MostrarArray(double[] array1, String[] array2, String[] array3) {
		for (int n=0;n<array2.length;n++) {
			System.out.println("El alumno "+array2[n]+" tiene una nota de "+array1[n]+" cuya calificacion es un "+array3[n]);
		
	}

}
	
	public static void NotFin(double array1[], String array3[]){
		
		for (int n=0;n<array1.length;n++) {
			
			if(array1[n]>=0 && array1[n]<4.99) {
				
				array3[n]="SUSPENSO";
				
			}
			if(array1[n]>=5 && array1[n]<6.99) {
				
				array3[n]="BIEN";
				
			}
			if(array1[n]>=7 && array1[n]<8.99) {
	
				array3[n]="NOTABLE";
	
}
			if(array1[n]>=9 && array1[n]<10) {
	
				array3[n]="SOBRESALIENTE";
	
}
		}
		
		
		 
		
			
		}
}
		
	