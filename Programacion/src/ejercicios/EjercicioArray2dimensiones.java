package ejercicios;

public class EjercicioArray2dimensiones {

	public static void main(String[] args) {
		
		int numero = 1;
		
		int matriz[][]=new int[3][3];
		
		 for (int n=0;n<matriz.length;n++) {
			 for (int i=0;i<matriz.length;i++) {
				 
				 matriz[n][i]=numero++;
				 matriz[n][i]=(i*matriz.length)+(n+1);
				 
				 System.out.print(matriz[n][n]+" ");
				 
			 }
			
			 System.out.println("");
			 
		 }
		 
		 

	}

}
