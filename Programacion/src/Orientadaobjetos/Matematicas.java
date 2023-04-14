package Orientadaobjetos;

public class Matematicas {
	
	public static double factorial(int n) {
		if(n <= 1) 
			return 1;
		else
			return n+ factorial(n-1);
	}


	



public static void main(String[] args) {
	System.out.print(factorial(3));
}
}
