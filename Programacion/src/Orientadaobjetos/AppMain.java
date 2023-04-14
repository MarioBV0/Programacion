package Orientadaobjetos;

public class AppMain {

	public static void main(String[] args) {
		Noria n1 = new Noria();
		
		n1.radio=9;
		
		System.out.println(n1.radio);
		n1.girar(15);
		n1.parar();

	}

}
