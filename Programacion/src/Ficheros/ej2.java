package Ficheros;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        try {
            File f = new File("prueba.txt");
            FileOutputStream fos = new FileOutputStream(f);


            fos.write('6');
            fos.write(54);
            String cadena = "\nHola\n agaporni";
            fos.write(cadena.getBytes());

            fos.close();
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
