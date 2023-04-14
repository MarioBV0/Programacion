package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5Array {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce una frase");
	        
	        String frase=sc.nextLine();
	        
	        char caracteres[]=new char [frase.length()];
	        for(int i=0;i<frase.length();i++) {
	        	caracteres[i]=frase.charAt(i);
	        }
	        System.out.println(Arrays.toString(caracteres));
	}

}
