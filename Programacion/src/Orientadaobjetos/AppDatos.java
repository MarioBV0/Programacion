package Orientadaobjetos;

public class AppDatos {

	public static void main(String[] args) {
		DatosPersonales dp = new DatosPersonales();
		
		
		
		System.out.println(dp.getNombre());
		System.out.println(dp.getApellidos());
		System.out.println(dp.getFechaNacimiento());
		
		dp.setNombre("sergio");
		dp.setApellidos("Rodriguez");
		dp.setFechaNacimiento("16/05/2002");
		
		System.out.println(dp.getNombre());
		System.out.println(dp.getApellidos());
		System.out.println(dp.getFechaNacimiento());

	}

}
