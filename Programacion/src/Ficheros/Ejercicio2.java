package Ficheros;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		final String nomFichero="pruebas2.txt";
        try(FileReader fr=new FileReader (nomFichero)){
 
            int valor=fr.read();
            while(valor!=-1){
               
                if(Character.isUpperCase(valor)){
                    System.out.print(Character.isLowerCase(valor));
                }
                valor=fr.read();
            }
        }catch(IOException e){
            System.out.println("Problemas con el E/S "+e);
        }

	}

}
