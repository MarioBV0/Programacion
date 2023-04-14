package Abstracción;

public abstract class Persona {
    
    
    protected String nombre;
    protected char sexo;
    protected int edad;
    private boolean asistencia;
     
    
    private final String[] NOMBRES_CHICOS={"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"}; 
    private final String[] NOMBRES_CHICAS={"Alicia", "Laura", "Clotilde", "Pepa", "Elena"}; 
    private final int CHICO=0;
    private final int CHICA=1;
     
   
 

    
    public Persona(String nombre, char sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
 
    public char getSexo() {
        return sexo;
    }
 
   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
   
    public int getEdad() {
        return edad;
    }
 
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
   
    public boolean isAsistencia() {
        return asistencia;
    }
 
   
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
     
    
    public abstract void disponibilidad();
     
}