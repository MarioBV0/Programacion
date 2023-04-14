package Array;



import java.util.Scanner;



public class Ejercicio2ArrayAleatorio {



   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int numArray=sc.nextInt();
        int numeros[]=new int[numArray];
            
            rellenarArray(numeros);
            indice(numeros);
            sumar(numeros);
        }
            
        public static void rellenarArray(int numeros[]) {



           for (int n=0;n<numeros.length;n++) {
                numeros[n]=(int) Math.floor(Math.random()*(9 -0 +1) +0 );
            }
            
        }
        public static void indice(int numeros[]) {
            
            for (int n=0;n<numeros.length;n++) {
                System.out.println("En el indice "+(n+1)+" está el valor "+numeros[n]);
            }
            
        }
        public static void sumar(int numeros[]) {
            int suma = 0;
            
            for (int n=0;n<numeros.length;n++) {
                suma=numeros[n]+suma;
            }
            System.out.println("La suma es "+suma);
        }
        }