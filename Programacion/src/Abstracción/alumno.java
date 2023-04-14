package Abstracción;

public class alumno extends Persona {


private int calificacion;


	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	
	
	public alumno(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, (char) edad, sexo);
        
       
        }
    
	
	public int notalumno() {
		
		int numero = (int)(Math.random()*10+1);
		
		return numero;
	}
	
	public void disponibilidad() {
		
		int yn = (int)(Math.random()*100+1);
		
		if(yn <= 50) {
			super.setAsistencia(false);
			
		}else 
			super.setAsistencia(true);
			
		
		
	}



}
