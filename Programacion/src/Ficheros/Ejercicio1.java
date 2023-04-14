package Ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
	public static void main(String[] args) {
		
	
			 
	        final String nomFichero="pruebas.txt";
	        try(FileReader fr=new FileReader (nomFichero)){
	 
	            int valor=fr.read();
	            while(valor!=-1){
	               
	                if(valor!=32){
	                    System.out.print((char)valor);
	                }
	                valor=fr.read();
	            }
	        }catch(IOException e){
	            System.out.println("Problemas con el E/S "+e);
	        }
	    }
	}


