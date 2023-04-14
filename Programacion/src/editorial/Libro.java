package editorial;

public class Libro {
	
	private String ISBN;
	private String Titulo;
	private String Autor;
	private int pags;
	
	
	
	
	public Libro(String iSBN, String titulo, String autor, int pags) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		this.pags = pags;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getPags() {
		return pags;
	}
	public void setPags(int pags) {
		this.pags = pags;
	}
	
	
	
    @Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", pags=" + pags + "]";
	}
    
    

}
