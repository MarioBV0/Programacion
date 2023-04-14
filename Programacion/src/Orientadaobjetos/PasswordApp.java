package Orientadaobjetos;

import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es el tamaño que quieres de cantidad de contraseñas?");
		int lon = sc.nextInt();
		
		System.out.println("¿Cual es la longitud de la contraseña?");
		int lon1 = sc.nextInt();
		
		String contraseñas[]=new String [lon];
		boolean comprob[]=new boolean[lon];
	
		
	
	for(int i=0;i<contraseñas.length;i++){
        contraseñas[i]=new Password(longitud);
        comprob[i]=contraseñas[i].esFuerte();
        System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
    }
}


	
}

