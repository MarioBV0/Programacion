package Ficheros;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario1 {

	public static void main(String[] args) {
		
		File directorio = new File("./FichEmpleados.dat");
		
		String[] nombres = {"Juan","Mario","Federico","Alex","Marco"};
		int[] edades = {3,19,24,23,98};
		float[] salarios= {1200,890,1200309,34567,5};
		
		
		try {
			FileOutputStream fis = new FileOutputStream(directorio);
			DataOutputStream quis = new DataOutputStream(fis);
			
			quis.writeUTF("paqui");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	

		
		
	}

}
