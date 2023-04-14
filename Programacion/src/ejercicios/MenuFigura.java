package ejercicios;

import java.util.Scanner;

public class MenuFigura {
//Para realizar las operaciones se deben de hacer con coma para poner numeros decimales, con punto no funciona.
	public static void main(String[] args) {

		
		int num = 0;
		int numF = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			do {
			System.out.println("            ╔══════════════════════════╗\r\n"
					+ "            ║      MENU PRINCIPAL      ║\r\n"
					+ "            ╠══════════════════════════╣\r\n"
					+ "            ║                          ║\r\n"
					+ "            ║      1. Triangulo        ║\r\n"
					+ "            ║      2. Cuadrado         ║\r\n"
					+ "            ║      3. Circulo          ║\r\n"
					+ "            ║      4. Salir            ║\r\n"
					+ "            ║                          ║\r\n"
					+ "            ╚══════════════════════════╝\r\n"
					+ "");

			
			num = sc.nextInt();

			if (num == 1) {
				
				

				System.out.println("                    ╔═══════ TRIANGULO═════════╗\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ║      1. Perimetro        ║\r\n"
						+ "                    ║      2. Area             ║\r\n"
						+ "                    ║      3. Volver           ║\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ╚══════════════════════════╝\r\n"
						+ "");
			}
			if (num == 2) {
				System.out.println("                    ╔═══════ CUADRADO═════════╗\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ║      1. Perimetro        ║\r\n"
						+ "                    ║      2. Area             ║\r\n"
						+ "                    ║      3. Volver           ║\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ╚══════════════════════════╝\r\n"
						+ "");
			
			}
			if (num == 3) {
				System.out.println("                    ╔═══════ CIRCULO═══════════╗\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ║      1. Perimetro        ║\r\n"
						+ "                    ║      2. Area             ║\r\n"
						+ "                    ║      3. Volver           ║\r\n"
						+ "                    ║                          ║\r\n"
						+ "                    ╚══════════════════════════╝\r\n"
						+ "");
			}
			
			
			
			if (num == 4) {
				break;

				
			}
			
			

			

			
			numF = sc.nextInt();
			
			}while(numF == 3);

			if (num == 1 && numF == 1) {
				
			
				
				double sumP = 0;

				System.out.println("          ¿Cuanto mide el lado a?");
				double a = sc.nextDouble();
				System.out.println("          ¿Cuanto mide el lado b?");
				double b = sc.nextDouble();
				System.out.println("          ¿Cuanto mide el lado c?");
				double c = sc.nextDouble();

				sumP = (a + b + c);

				System.out.println("╔════════════════════════════════════════╗\r\n"
						+ "║ El resultado del perimetro es " + sumP + " cm   ║\r\n"
						+ "╚════════════════════════════════════════╝\r\n"
						+ "");

			}

			if (num == 1 && numF == 2) {

				
				double sumA = 0;

				System.out.println("          ¿Cuanto mide la base?");
				double ba = sc.nextDouble();
				System.out.println("          ¿Cuanto mide la altura?");
				double al = sc.nextDouble();

				sumA = (ba * al)/2;

				System.out.println("		╔════════════════════════════════════════╗\r\n"
						+ "		║ La area mide es " + sumA + " cm²  		 ║\r\n"
						+ "		╚════════════════════════════════════════╝\r\n"
						+ "");

			}
			
		
		
		
		if (num == 2 && numF == 1) {
			
			double sumCP = 0;

			System.out.println("          ¿Cuanto mide el lado a?");
			double ac = sc.nextDouble();
			System.out.println("          ¿Cuanto mide el lado b?");
			double bc = sc.nextDouble();
			System.out.println("          ¿Cuanto mide el lado c?");
			double cc = sc.nextDouble();
			System.out.println("          ¿Cuanto mide el lado d?");
			double dc = sc.nextDouble();

			sumCP = (ac + bc + cc + dc);

			System.out.println("╔════════════════════════════════════════╗\r\n"
					+ "║ El resultado del perimetro es " + sumCP + " cm   ║\r\n"
					+ "╚════════════════════════════════════════╝\r\n"
					+ "");
			
		}
		
		if (num == 2 && numF == 2) {
			
			double sumAC = 0;

			System.out.println("          ¿Cuanto mide el primer lado?");
			double lc1 = sc.nextDouble();
			System.out.println("          ¿Cuanto mide el segundo lado?");
			double lc2 = sc.nextDouble();
			

			sumAC = (lc1*lc2);

			System.out.println("		╔════════════════════════════════════════╗\r\n"
					+ "		║ La area mide es " + sumAC + " cm²  		 ║\r\n"
					+ "		╚════════════════════════════════════════╝\r\n"
					+ "");
			
		}
		
		if (num == 3 && numF == 1) {
			double PI = 3.14;
			double sumCi = 0;
			
			
			System.out.println("          ¿Cuanto mide el radio?");
			double rad = sc.nextDouble();
			

			sumCi = (2*PI*rad);

			System.out.println("╔════════════════════════════════════════╗\r\n"
					+ "║ El resultado del perimetro es " + sumCi + " cm  ║\r\n"
					+ "╚════════════════════════════════════════╝\r\n"
					+ "");
		
		}
		
		if (num == 3 && numF == 2) {
			double PI = 3.14;
			double sumCA = 0;
			
			
			System.out.println("          ¿Cuanto mide el radio?");
			double rad = sc.nextDouble();
			

			sumCA = (PI*(rad*rad));

			System.out.println("╔════════════════════════════════════════╗\r\n"
					+ "║ El resultado del Area es " + sumCA + " cm      ║\r\n"
					+ "╚════════════════════════════════════════╝\r\n"
					+ "");
		
		}
		
		
		
		
			
		} while ( numF == 4);
		System.out.println("         ==== EL PROGRAMA HA FINALIZADO ====");
		
		
		

		}
	}


