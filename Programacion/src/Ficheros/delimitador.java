package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class delimitador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine();

		System.out.println("Introduzca su primer apellido");
		String apellido1 = sc.nextLine();

		System.out.println("Introduzca su segundo apellido");
		String apellido2 = sc.nextLine();

		System.out.println("Introduzca su edad");
		int edad = sc.nextInt();
		

		File fich = new File("./fichero.txt");
		String delimitacion = "#";
		
		escribir(fich, nombre, apellido1, apellido2, edad, delimitacion);
		

		try {
			FileReader red = new FileReader(fich);
			BufferedReader br = new BufferedReader(red);
			String linea = br.readLine();
			br.close();

			String listaCampos[] = linea.split(delimitacion);

			for (int i = 0; i < listaCampos.length; i++) {
				System.out.println(listaCampos[i]);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error: el archivo no existe.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error al leer el archivo.");
			e.printStackTrace();
		}
	}

	public static void escribir(File fich, String nombre, String apellido1, String apellido2, int edad,
			String delimitacion) {
		try {
			FileWriter es = new FileWriter(fich);
			es.write(nombre + delimitacion + apellido1 + delimitacion + apellido2 + delimitacion + edad);
			es.close();
		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo.");
			e.printStackTrace();
		}
	}
}
