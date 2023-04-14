package Posible;

public class Asignatura {
	
	public static final int CODIGO_PROGRAMACION = 1;
    public static final int CODIGO_ENTORNOS_DESARROLLO = 2;
    public static final int CODIGO_REDES = 3;
    
    public static final String NOMBRE_PROGRAMACION = "Programación";
    public static final String NOMBRE_ENTORNOS_DESARROLLO = "Entornos de Desarrollo";
    public static final String NOMBRE_REDES = "Redes";
	
	 private int codigoAsignatura;
	    private String nombre;
	    private String profesor;
	    private double nota;
	    
	    public Asignatura(int codigoAsignatura, String nombre, String profesor, double nota) {
	        this.codigoAsignatura = codigoAsignatura;
	        this.nombre = nombre;
	        this.profesor = profesor;
	        this.nota = nota;
	    }

	    public int getCodigoAsignatura() {
	        return codigoAsignatura;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getProfesor() {
	        return profesor;
	    }

	    public double getNota() {
	        return nota;
	    }
	    
	    public void setNota(double nota) {
	        this.nota = nota;
	    }

		@Override
		public String toString() {
			return "Asignatura [codigoAsignatura=" + codigoAsignatura + ", nombre=" + nombre + ", profesor=" + profesor
					+ ", nota=" + nota + "]";
		}
	    
	    
	
	

}
