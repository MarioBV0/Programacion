package Orientadaobjetos;

public class Videojuego implements Entregable {
	
	public static final int est=100;
	public static final boolean entr=false;
	public static final int IGUAL=0;
	public static final int MENOR=-1;
	public static final int MAYOR=1;
	
	private String titulo;
	private int horas;
	private  boolean entregado;
	private String genero;
	private String compañia;
	
	
	
	
	
	
	public Videojuego(int horas, boolean entregado) {
		super();
		this.horas = est;
		this.entregado = entr;
	}


	public Videojuego(String titulo, int horas, boolean entregado, String compañia) {
		super();
		this.titulo = titulo;
		this.horas = est;
		this.entregado = entr;
		this.compañia = compañia;
	}


	public Videojuego(String titulo, int horas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.genero = genero;
		this.compañia = compañia;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}



	public void entregar() {
		entregado=true;
		
		
	}

	public void devolver() {
		entregado=false;
		
	}


	
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
		
	}


	@Override
	public int compareTo(Object a) {
		
		
		int estado = MENOR;
		Videojuego ref = (Videojuego) a;
		
		if(horas > ref.getHoras())
		{
			estado = MAYOR;
			
		}else if (horas == ref.getHoras()) {
			estado = IGUAL;
		}
		
		return estado;
	}
	
	
	
	
	
	
	

}
