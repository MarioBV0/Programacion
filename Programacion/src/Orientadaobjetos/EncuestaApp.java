package Orientadaobjetos;

import java.util.Random;

public class EncuestaApp {

	public static void main(String[] args) {

		int encuesta[][] = new int[3][10];

		rellenarSexo(encuesta);
		rellenarTrabajo(encuesta);
		rellenarSueldo(encuesta);
		
		

	}

	public static void rellenarSexo(int[][] encuesta) {

		Random r = new Random();

		for (int j = 0; j < 10; j++) {

			encuesta[0][j] = r.nextInt(2) + 1;

			if (encuesta[0][j] == 1) {

				System.out.print("H    ");

			}

			if (encuesta[0][j] == 2) {

				System.out.print("M    ");

			}
			
		
			


		}
		
		System.out.println("");

	}
	

	
	

	public static void rellenarTrabajo(int[][] encuesta) {

		Random r = new Random();

		for (int j = 0; j < encuesta.length; j++) {

			encuesta[1][j] = r.nextInt(2) + 1;
			
			if (encuesta[1][j] == 1) {

				System.out.print("Trabaja    ");

			}

			if (encuesta[1][j] == 2) {

				System.out.print("No trabaja     ");

			}
			
			
			


		}
		
		System.out.println("");
	}

	public static void rellenarSueldo(int[][] encuesta) {

		Random r = new Random();

		for (int j = 0; j < encuesta.length; j++) {

			
			if (encuesta[1][j] == 1) {

				System.out.println(r.nextInt(2000) + 600);

			}

			if (encuesta[1][j] == 2) {

				System.out.println(r.nextInt(0) + 0);
				
				System.out.println();

			}
			
			
		

		}
		
		System.out.println("");

	}

	public static void PorcentajeHombre(int[][] encuesta) {

		for (int j = 0; j < encuesta.length; j++) {

			double result = encuesta[3][j] / 10;

			System.out.println(result);

		}

	
	}


	}
	




