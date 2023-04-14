package Errores;

import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		
		int x;
		try{
		x=Integer.parseInt(
		JOptionPane.showInputDialog("Escriba un número"));
		}
		catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "El número no es válido");
		
		System.err.println(e.toString());
		System.err.println(e.getMessage());
		}
		catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Error indeterminado");
		}
	}

}
