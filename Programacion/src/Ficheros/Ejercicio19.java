package Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el comando 'dir'");
		String orden = sc.nextLine();

		System.out.println("Introduce la ruta");
		String ruta1 = sc.nextLine();

		try {

			if (orden.equals("dir") && ruta1.equals("")) {
				File directorio = new File(".");
				File[] archivos = directorio.listFiles();

				for (int n = 0; n < archivos.length; n++) {

					if (archivos[n].isDirectory()) {
						System.out.println("dir");
						System.out.println("  " + archivos[n] + " " + archivos[n].length() + " bytes");
					}

					if (archivos[n].isFile()) {
						System.out.println("file");
						System.out.println("  " + archivos[n] + " " + archivos[n].length() + " bytes");
					}
				}

			} else {

				File directorio = new File(ruta1);
				File[] archivos = directorio.listFiles();

				for (int n = 0; n < archivos.length; n++) {

					if (archivos[n].isDirectory()) {
						System.out.println("dir");
						System.out.println("  " + archivos[n] + " " + archivos[n].length() + " bytes");
					}

					if (archivos[n].isFile()) {
						System.out.println("file");
						System.out.println("  " + archivos[n] + " " + archivos[n].length() + " bytes");
					}
				}

			}

			if (orden.equals("dir -r")) {
				File directorio1 = new File(ruta1);
				File[] archivos0 = directorio1.listFiles();

				for (int n = 0; n < archivos0.length; n++) {

					if (archivos0[n].isDirectory()) {

						File[] archivos2 = archivos0[n].listFiles();

						for (int i = 0; i < archivos2.length; i++) {
							if (archivos2[i].isDirectory()) {

								System.out.println("dir");
								System.out.println("  " + archivos2[i] + " " + archivos2[i].length() + " bytes");

							}

							if (archivos2[i].isFile()) {
								System.out.println("file");
								System.out.println("  " + archivos2[i] + " " + archivos2[i].length() + " bytes");

							}
						}

					}
				}
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		} finally {

		}

	}
}