package ejercicios;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		 int num = 0;
	        int may = 0;
	        int men = 0;
	        int sum = 0;
	        int sumaP = 0;
	        int sumaN = 0;
	        int med = 0;
	        int cont = 0;
	        while(num !=-1) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("Introduce un número");
	            num= sc.nextInt();    
	        cont++;
	        if (num !=-1) {
	        if (num>may)
	        may=num;
	        
	        if (num<men)
	            men=num;
	        
	        sum=sum+num;
	        
	        if (num>-1)
	            sumaP=sumaP+num;
	        
	        if (num<0)
	            sumaN=sumaN+num;
	        
	        med=sum/cont;
	        }
	        }
	        System.out.println("El número mayor es "+may);
	        System.out.println("El número menor es "+men);
	        System.out.println("La suma total es "+sum);
	        System.out.println("La suma de los positivos es "+sumaP);
	        System.out.println("La suma de los negativos es "+sumaN);
	        System.out.println("La media es "+med);

	}

}
