package Abstracción;


public class trabajoApp {

	public static void main(String[] args) {
		
		comercial com1 = new comercial("Paqui",60,900,10);
		comercial com2 = new comercial("Angel",18,2000,3000);
		
		repartidor rep1 = new repartidor("Mario",18,500,"ZonaFriki");
		repartidor rep2 = new repartidor("Marco",20,18000,"Zona3");
		
		
		System.out.println(com1.toString());
		System.out.println(com1.plus());
		System.out.println(com2.toString());
		System.out.println(com2.plus());
		
		System.out.println(rep1.toString());
		System.out.println(rep1.plus());
		System.out.println(rep2.toString());
		System.out.println(rep2.plus());

		
	}

}
