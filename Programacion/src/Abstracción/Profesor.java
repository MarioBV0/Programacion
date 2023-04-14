package Abstracción;

public class Profesor extends Persona {
	
	private final static String mates="matematicas";
	private final static String filo="filosofia";
	private final static String fisica="fisica";
	
	private String materia;
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public static String getMates() {
		return mates;
	}
	public static String getFilo() {
		return filo;
	}
	public static String getFisica() {
		return fisica;
	}
	
	
	
	
public Profesor(String materia) {
		super(nombre,edad);
		this.materia = materia;
	}
public void disponibilidad() {
		
		int ynp = (int)(Math.random()*100+1);
		
		if(ynp < 20) {
			super.setAsistencia(false);
			
		}else 
			super.setAsistencia(true);
			
		
		
	}


	
	
	

}
