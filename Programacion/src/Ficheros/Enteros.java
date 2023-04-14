package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Enteros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long size;
		
		File f=new File("./prueba.out");
		try {
			RandomAccessFile fichero = new RandomAccessFile( f, "rw");
			size = fichero.length();
			System.out.println("Introduce un numero entero para añadir al final del fichero:");
			int numero = sc.nextInt();	
			
			
					} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	}

}
