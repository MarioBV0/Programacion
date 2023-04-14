package ejercicios;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		    int valor=0;
		    int lista[]=new int [10];
		    for (int i=0;i<lista.length;i++) {
		    System.out.println("Introduce un valor");
		    valor = sc.nextInt();
		    lista[i]=valor;
		    }
		    for (int i=0;i<10;i++) {
		    System.out.println("=>"+lista[i]);
		    }
		    sc.close();
		    }
		
				



		
	}


