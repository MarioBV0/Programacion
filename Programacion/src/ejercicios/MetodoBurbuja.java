package ejercicios;

public class MetodoBurbuja {

	public static void main(String[] args) {
		
		int A[]= {45,20,21,68};
		
		burbuja(A);
		
		   for (int i = 0; i < A.length - 1; i++) {
			   System.out.println(A[i]);
			   
			   
			   
		   }
		
	}
		
		
	public static void burbuja(int A[]) {
	        int i, j, aux;
	        for (i = 0; i < A.length - 1; i++) {
	            for (j = 0; j < A.length - i - 1; j++) {                                                              
	                if (A[j + 1] > A[j]) {
	                    aux = A[j + 1];
	                    A[j + 1] = A[j];
	                    A[j] = aux;
	                    
	                }
	                }
	            }
	         
	        }
	        
	        
	}

	


