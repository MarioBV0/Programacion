package ejercicios;

import java.util.regex.Pattern;

public class pattern {

	public static void main(String[] args) {
		String cadena = JOptionPane.showInputDialog("Escribe un texto");
		
		Pattern pat = Pattern.compile("[a-zA-Z]{5,10}");
		Matcher mat = pat.matcher(fechas);
		if (mat.matches) {
			System.out.println("Fecha valida");
		} else {
			System.out.println("Fecha no valida");
		}

	}

}
