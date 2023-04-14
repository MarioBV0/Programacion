package ejercicios;

public class Funcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		sumar(4,3);
		int resul1 = restar(5,3);
		System.out.println("La resta es "+resul1);
		System.out.println("== FIN ==");
	}
public static void sumar(int num1, int num2) {
	int resul = num1 + num2;
System.out.println("la suma es "+resul);
}

public static int restar(int num1, int num2) {
	int resul1 = num1 - num2;
 return resul1;
}
	

}
