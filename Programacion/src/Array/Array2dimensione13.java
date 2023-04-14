package Array;

import java.util.Scanner;

public class Array2dimensione13 {

	public static void main(String[] args) {

		int sumfi = 0;
		int sumco = 0;
		int sumpos = 0;
		int suminv = 0;
		int elec = 0;
		double media = 0;
		int suma = 0;

		int matriz[][] = new int[4][4];

		while (elec != 8) {

			System.out.println("★MENU★");

			System.out.println("1. Rellenar Matriz");

			System.out.println("2. Mostrar Matriz");

			System.out.println("3. Sumar fila");
			System.out.println("4. Sumar columna");

			System.out.println("5. Suma diagonal descendente");

			System.out.println("6. Suma diagonal descendente");

			System.out.println("7. Media elementos");
			System.out.println("8. Salir");

			Scanner sc = new Scanner(System.in);

			elec = sc.nextInt();

			if (elec == 1) {

				rellenar(matriz);

			}

			if (elec == 2) {

				mostrar(matriz);

			}

			if (elec == 3) {

				sumfilas(matriz, sumfi);

			}
			if (elec == 4) {

				sumcolumnas(matriz, sumco);

			}
			if (elec == 5) {

				sumpos(matriz, sumpos);

			}
			if (elec == 6) {

				suminv(matriz, suminv);

			}
			if (elec == 7) {

				media(matriz, media, suma);

			}

			if (elec == 8) {

				System.out.println("==== TERMINASTE EL EJERCICIO ====");

			}

		}

	}

	public static void rellenar(int[][] matriz) {

		Scanner sc = new Scanner(System.in);

		for (int n = 0; n < matriz.length; n++) {
			for (int i = 0; i < matriz[n].length; i++) {

				System.out.println("Introduce los valores");
				matriz[n][i] = sc.nextInt();

			}

		}

	}

	public static void mostrar(int[][] matriz) {

		for (int n = 0; n < matriz.length; n++) {
			for (int i = 0; i < matriz[n].length; i++) {

				System.out.print(matriz[n][i] + " ");

			}
			System.out.println("");
		}

	}

	public static void sumfilas(int[][] matriz, int sumfi) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que fila quieres sumar?");
		int fila = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {

			sumfi = sumfi + matriz[fila][i];

		}
		System.out.println("El resultado de la suma de la fila " + fila + " es " + sumfi);
	}

	public static void sumcolumnas(int[][] matriz, int sumco) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Que columna quieres sumar?");
		int columna = sc.nextInt();

		for (int n = 0; n < matriz.length; n++) {

			sumco = sumco + matriz[columna][n];

		}

		System.out.println("El resultado de la suma de la columna " + columna + " es " + sumco);
	}

	public static void sumpos(int[][] matriz, int sumpos) {

		for (int n = 0; n < matriz.length; n++) {

			for (int i = 0; i < matriz.length; i++) {

				sumpos = matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3];
			}
		}

		System.out.println("El resultado de la suma en diagonal para abajo es " + sumpos);

	}

	public static void suminv(int[][] matriz, int suminv) {

		for (int n = 0; n < matriz.length; n++) {

			for (int i = 0; i < matriz.length; i++) {

				suminv = matriz[3][0] + matriz[2][1] + matriz[1][2] + matriz[0][3];
			}
		}

		System.out.println("El resultado de la suma en diagonal para arriba es " + suminv);

	}

	public static void media(int[][] matriz, double media, int suma) {

		for (int n = 0; n < matriz.length; n++) {

			for (int i = 0; i < matriz.length; i++) {

				suma += matriz[n][i];
				media = suma / (matriz.length * matriz.length);
			}
		}

		System.out.println("El resultado de la media es " + media);

	}
}
