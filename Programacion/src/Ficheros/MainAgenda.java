package Ficheros;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class MainAgenda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre");
		String nombre=sc.nextLine();
		
		System.out.println("Introduzca el apellido");
		String apellido=sc.nextLine();
		
		System.out.println("Introduzca el telefono");
		String telefono=sc.nextLine();
		
		System.out.println("Introduzca el email");
		String email=sc.nextLine();
		
		
		System.out.println("Introduzca la fecha de nacimiento");
		String fechade=sc.nextLine();
		
		
		
		
		Agenda agen = new Agenda(nombre,apellido,telefono,email,fechade);
		
		

		
		try {
			
			
			File archivo = new File("./Agenda.dat");
			
			ObjectOutputStream fis = new ObjectOutputStream(archivo);
			fis.writeObject(agen);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			while(!finArchivo) {
				Agenda agenda = (Agenda) ois.readObject();
				System.out.println(agenda);
			}
			
		}catch (IOException e) {
			
			finArchivo = true;
		}catch (ClassNotFoundException e) {
			System.out.println(e.Message)
		}
	

	}

}
