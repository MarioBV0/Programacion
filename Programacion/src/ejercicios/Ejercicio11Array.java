package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el numero");
		
		 String numero=sc.nextLine();
		 
	       
	        int digitos[]=convierteNumeroAArray(numero, numero.length());
	 
	       
	        if (EsCapicua(digitos)){
	            System.out.println("El numero "+numero+" es capicua");
	        }else{
	            System.out.println("El numero "+numero+" no es capicua");
	        }
	    }
	    public static int[] convierteNumeroAArray(String numero, int longitud){
	 
	        int digitos[]=new int[longitud];
	 
	        for(int i=0;i<digitos.length;i++){
	            digitos[i]=Character.getNumericValue(numero.charAt(i));
	        }
	        return digitos;
	    }
	 
	    public static boolean EsCapicua (int lista[]){
	 
	       
	        int listaprueba[]=new int [lista.length];
	 
	        
	        for (int i=0, j=1;j<=lista.length;i++, j++){
	            listaprueba[i]=lista[lista.length-j];
	        }
	 
	 
	        if (Arrays.equals(lista, listaprueba)){
	            return true;
	        }
	 
	        return false;
	 
	    }
	 
	

	}

