package Orientadaobjetos;

import java.util.Scanner;

public class metodos {
	
	
	
public static String Invierte(String cadena) {
	
	for(int i = 0; i < cadena.length(); i++) {
        char caracter = cadena.charAt(i);
		
	   if(Character.isLowerCase(caracter)) {
		String resultado=cadena.toUpperCase();
		
		return resultado;
	
	   }else  if(Character.isUpperCase(caracter)) { 
		   String resultado=cadena.toLowerCase();
		   
		   return resultado;
		   
	   }
	   
	   if(Character.isDigit(caracter)) {
		   
		   System.out.println(".");
		   
		   
		   
	   }
	   
		}
	return cadena;
	
	
	
	
		}
		
		
	}
