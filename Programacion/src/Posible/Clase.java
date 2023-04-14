package Posible;

import java.util.ArrayList;

public class Clase {

	public static void main(String[] args) {
		
		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		
		Asignatura asig1 = new Asignatura(1, "wdwd", null, 0);
		Asignatura asig2 = new Asignatura(2, "entornos", null, 0);
		asignaturas.add(asig1);
		asignaturas.add(asig2);
		
		Direccion direccion1 = new Direccion(null, 0, 0, null, 0, null, null);
		
		Alumno alumno1 = new Alumno(1,"dwdww","wwddd",asignaturas,direccion1);
		
	System.out.println(alumno1.toString());
	System.out.println(asignaturas.toString());
	
	for (Object a:asignaturas) {
		System.out.println(a);
	}

	}

}
