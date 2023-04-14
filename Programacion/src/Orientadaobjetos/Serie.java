package Orientadaobjetos;

public class Serie implements Entregable {
	
	public static final int temp=3;
	public static final boolean entre=false;
	public static final int IGUAL=0;
	public static final int MENOR=-1;
	public static final int MAYOR=1;
	
	
	
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		super();
		this.temporadas = temp;
		this.entregado = entre;
	}


	public Serie() {
		super();
	}


	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas = temp;
		this.entregado = entre;
	}


	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getTemporadas() {
		return temporadas;
	}


	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
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
	Serie ref = (Serie) a;
	
	if(temporadas > ref.getTemporadas())
	{
		estado = MAYOR;
		
	}else if (temporadas == ref.getTemporadas()) {
		estado = IGUAL;
	}
	
	return estado;
	
	
	
	

	
	
}
	
	
}
