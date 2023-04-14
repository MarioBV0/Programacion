package ejercicios;


import java.util.Scanner;

public class abe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "esternocleidomastoideo";
        String palabraAdivinada = "";

        // Inicializar la palabra adivinada con guiones bajos
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada += "_";
        }

        int vidas = 6;
        while (vidas > 0) {
            System.out.println("Palabra adivinada: " + palabraAdivinada);
            System.out.println("Ingresa una letra:");
            char letra = sc.next().charAt(0);
            boolean letraEncontrada = false;

            // Comprobar si la letra se encuentra en la palabra secreta
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    // Reemplazar el guión bajo con la letra encontrada
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i + 1);
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                vidas--;
            }

            // Comprobar si se ha adivinado la palabra
            if (!palabraAdivinada.contains("_")) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                return;
            }
        }

        // Si se han acabado las vidas, mostrar la palabra secreta
        System.out.println("Lo siento, has perdido. La palabra secreta era: " + palabraSecreta);
    }
}

