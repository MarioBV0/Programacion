package Posible;

import java.util.ArrayList;

public class Alumno {
	
	private int codigoAlumno;
    private String nombre;
    private String dni;
    private ArrayList<Asignatura> asignaturas;
    private Direccion direccion;
    
    public Alumno() {
        asignaturas = new ArrayList<Asignatura>();
    }
    
    public Alumno(int codigoAlumno, String nombre, String dni, ArrayList<Asignatura> asignaturas, Direccion direccion) {
        this.codigoAlumno = codigoAlumno;
        this.nombre = nombre;
        this.dni = dni;
        this.asignaturas = asignaturas;
        this.direccion = direccion;
    }

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

	@Override
	public String toString() {
		return "Alumno [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre + ", dni=" + dni + ", asignaturas="
				+ asignaturas + ", direccion=" + direccion + "]";
	}
    
    
}


