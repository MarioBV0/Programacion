package Array;

import java.util.Scanner;

public class MaquinaExpendedora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int xp = 0;
		int xs = 0;	
		int ke =0;

		int num = 0;
		int op = 0;
		int elec = 0;
		double dinero = 5;
		String pass = "ClaudioMoyano";

		String[][] golosinas = {

				{ "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },

				{ "Piruletas", "Bolsa variada Haribo", "Chetoos", "Twix" },

				{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },

				{ "Lacasitos XL", "Crunch", "Milkybar", "Donuts" } };

		double[][] precio = {

				{ 1.1, 0.8, 1.5, 0.9 },

				{ 1.8, 1, 1.2, 1 },

				{ 1.8, 1.3, 1.2, 0.8 },

				{ 2.5, 1.1, 1.1, 1.1 }

		};
		
		
		int[][] cantidad = {

				{ 5 ,5 , 5 ,5 },

				{ 5, 5, 5, 5 },

				{ 5, 5, 5, 5 },

				{ 5 ,5 ,5 , 5 }

		};

		while (elec != 4) {

			System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⢀⣀⡀⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⠛⣿⣿⠋⣿⣿⣿⣿⣿⠀⣿⠉⣿⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣏⣁⣀⣉⣁⣀⣉⣉⣉⣉⣿⠀⠿⠶⠿⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⡿⠛⢿⣿⣿⠀⠰⠶⠆⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣯⣭⣭⣭⣭⣭⣥⣤⣬⣭⣿⠀⠐⠶⠆⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⢿⣿⠁⣿⣿⠉⢹⣿⣿⠀ 1. Pedir⠀   ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⠀⠀2. Mostrar⠀ ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⠉⠙⣿⠉⠉⣿⣿⣿⣿⣿⠀⠀3. Rellenar⠀⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⠀⠀4. Apagar⠀⠀ ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀    ⠀        ⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⠀⠀⠀⠀        ⠀⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⠀⠀⠀        ⠀⠀⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠀        ⠀⠀⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿////////////////////////////⣿⣿⣿⣿⣿⣿\r\n"
					+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

			elec = sc.nextInt();

			if (elec == 1) {
				pedir(golosinas, precio, dinero,cantidad, xp, xs, ke);
			}

			if (elec == 2) {
				mostrar(golosinas, precio, num);
			}

			if (elec == 3) {
				rellenar(golosinas, pass,cantidad, xp, xs);
			}

			if (elec == 4) {
				
				System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⢀⣀⡀⠀       ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⠛⣿⣿⠋⣿⣿⣿⣿⣿⠀⣿⠉⣿⠀       ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣏⣁⣀⣉⣁⣀⣉⣉⣉⣉⣿⠀⠿⠶⠿⠀       ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⡿⠛⢿⣿⣿⠀⠰⠶⠆⠀       ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣯⣭⣭⣭⣭⣭⣥⣤⣬⣭⣿⠀⠐⠶⠆⠀       ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⡟⢿⣿⠁⣿⣿⠉⢹⣿⣿⠀           ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⠀⠀          ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⠉⠙⣿⠉⠉⣿⣿⣿⣿⣿⠀⠀          ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣿⠀⠀⠀⠀        ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀    ⠀      ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⠀Apagando..⠀⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢻⠀⠀⠀        ⠀⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠀       ⠀ ⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿////////////////////////////⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
			}

		}

	}

	public static void pedir(String[][] golosinas, double[][] precio, double dinero, int[][] cantidad, int xp, int xs, int ke ) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" == ¿Que golosina desea? ==");
		String op = sc.next();

		char np = op.charAt(0);
		char ns = op.charAt(1);

		 xp = Character.getNumericValue(np);
		 xs = Character.getNumericValue(ns);

		System.out.println(golosinas[xp][xs] + " y su precio es de " + precio[xp][xs]);

		System.out.println("");

		double coste = precio[xp][xs];

		System.out.println(
				"== Si quiere la golosina, porfavor intruzca su precio, si no esta de acuerdo con la eleccion pulse 4 ==");

		double elec1 = sc.nextDouble();

		if (elec1 == coste) {
			 cantidad[xp][xs]= (cantidad[xp][xs] - 1);
			 
			  ke=cantidad[xp][xs];
			 
			 System.out.println("*Saca "+ golosinas[xp][xs]+"*"+" Actualmente quedan "+cantidad[xp][xs]+" "+golosinas[xp][xs]);;

			

		}
		
		
		if (ke <= 0) {
			 System.out.println("NO HAY MAS GOLOSINAS!!!!!!");

			

		}

		if (elec1 == 4) {

			System.out.println("== Muchas gracias por utilizar esta maquina expendedora ==");

		}

	}

	public static void mostrar(String[][] golosinas, double[][] precio, int num) {

		for (int n = 0; n < precio.length; n++) {
			for (int i = 0; i < precio.length; i++) {

				System.out.println(+n + "" + i + " " + golosinas[n][i] + "|" + precio[n][i] + "| ");

			}

		}

		System.out.println("");

	}

	public static void rellenar(String[][] golosinas, String pass, int[][] cantidad, int xp, int xs){

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Bienvenido a la base de datos de la Maquina Expendedora, si quiere entrar en la configuracion para rellenar, porfavor escriba la contraseña");
		String contra = sc.nextLine();

		if (pass.equals(contra)) {

			System.out.println(
					"☠ Bienvenido a la configuracion de administrador de la maquina, introduce la posicion de la golosina que quieres rellenar ☠");

			String op1 = sc.next();

			char np = op1.charAt(0);
			char ns = op1.charAt(1);

			xp = Character.getNumericValue(np);
			xs = Character.getNumericValue(ns);

			System.out.println("Has elegido " + golosinas[xp][xs] + " Ahora elige la cantidad que quieres rellenar");
			int cant = sc.nextInt();

			System.out.println("Ahora tiene la maquina "+ (cantidad[xp][xs] + cant)+" "+golosinas[xp][xs] );

			System.out.println("");

		} else {

			System.out.println("¡LA CONTRASEÑA ES INCORRECTA!");
		}

	}

}
