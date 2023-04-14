package ejercicios;

import java.util.Scanner;

public class Ejercicio4Array {

	public static void main(String[] args) {
		
		
		
		 
		  
		  rellenarArray(numeros);
		  sumar(numeros);
		  media(numeros);
		  
		  

	}
	
	public static void rellenarArray(int numeros[]) {
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=i;
			
		}
			
			
			
		}
	
	
	public static void sumar(int numeros[]) {
		 int suma = 0;
         
         for (int i=0;i<numeros.length;i++) {
             suma=numeros[i]+suma;
         }
         System.out.println("La suma es "+suma);
    }
	
	
	public static void media(int numeros[]) {
        
        for (int i=0;i<numeros.length;i++) {
            int media=(sumar(numeros))/100;
        }
		System.out.println("La media es "+media);
   }

}
