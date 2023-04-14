package ejercicios;



import java.util.Scanner;



public class Ejercicio3ArrayPrimos {



   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int numArray=sc.nextInt();
        int numeros[]=new int[numArray];
            
        numAleatorio(1,100);
        rellenarArray(numeros,1,100);
        mostrarArray(numeros);
        mayorArray(numeros);
        }
            
        public static int numAleatorio( int min, int max) {



               return (int) Math.floor(Math.random()*(max -min +1) +min );
            
        }
        public static boolean esPrimo(int num) {
            
            if (num<=1) {
                return false;
                
            }else {
                int cont=0;
                for (int i=2;i<num;i++) {
                    if (num%i==0)
                        cont++;
                }
                return cont<1;
            }
        }
        public static void rellenarArray(int numeros[],int min, int max) {



           int cont=0;
            while (cont<numeros.length) {
                int num=numAleatorio(min,max);
                
                if (esPrimo(num)) {
                    numeros[cont]=num;
                    cont++;
                }
            }
            
        }
        public static void mostrarArray(int numeros[]) {
            
            for (int n=0;n<numeros.length;n++) {
                System.out.println("En el indice "+(n+1)+" está el valor "+numeros[n]);
            }
            
        }
        public static void mayorArray(int numeros[]) {
            int mayor=0;
            for (int n=0;n<numeros.length;n++) {
                
                if (numeros[n]>mayor) {
                    mayor=numeros[n];                    
                }
            }
            System.out.println("El numero mayor es " +mayor);
        }
        
    }