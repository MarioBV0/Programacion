package Abstracción;

import java.util.concurrent.Flow.Processor;

import Posible.Alumno;



public class Aula {
	
	private int id;
	private Profesor profesor;
	private Alumno[] alumno;
	private String materia; 
	
	
	
	private final int MAX_ALUMNOS = 20;
	
	public Aula() {
		
		id = 1;
		
		
		profesor = new Profesor();
		
		alumno = new Alumno[MAX_ALUMNOS];
		
		creaAlumnos();
		
		
		
		
		
	}
}
