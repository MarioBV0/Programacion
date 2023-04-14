package ejercicios;

import java.util.Scanner;

public class Ahorcadoejercicio {
    public static void main(String[] args) {
        String[] palabras = {"programar", "computadora", "java", "ahorcado"};
        String palabraElegida = palabras[(int) (Math.random() * palabras.length)];
        String palabraOculta = new String(new char[palabraElegida.length()]).replace("\0", "_");
        int intentos = 0;
 
        Scanner teclado = new Scanner(System.in);
        while (intentos < 5 && palabraOculta.contains("_")) {
            System.out.println("La palabra oculta es: " + palabraOculta);
            System.out.print("Ingresa una letra: ");
            String letra = teclado.nextLine();
            if (palabraElegida.contains(letra)) {
                for (int i = 0; i < palabraElegida.length(); i++) {
                    if (palabraElegida.charAt(i) == letra.charAt(0)) {
                        palabraOculta = palabraOculta.substring(0, i) + letra + palabraOculta.substring(i + 1);
                    }
                }
            } else {
                intentos++;
                System.out.println("La letra no está en la palabra. Llevas " + intentos + " intentos.");
            }
        }
        if (palabraOculta.equals(palabraElegida)) {
            System.out.println("Felicidades, adivinaste la palabra: " + palabraElegida);
        } else {
            System.out.println("Lo siento, se acabaron tus intentos. La palabra era " + palabraElegida);
        }
    }
}					 
									 