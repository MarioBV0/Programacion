package Ficheros;

import java.io.File;
import java.io.IOException;

public class ej1 {

    public static void main(String[] args) {

        File archivo1 = new File("directorio1", "fichero1.txt");

        try {
            if (!archivo1.exists()) {
                if (archivo1.getParentFile().mkdirs() && archivo1.createNewFile()) {

                    System.out.println("Directorio y fichero creados");

                } else {
                    System.out.println("Error al crear el Directorio o el fichero");

                }
            } else {

                System.out.println("Ya existe el Directorio y el fichero");
                System.out.println(archivo1.getAbsolutePath());
            }

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
