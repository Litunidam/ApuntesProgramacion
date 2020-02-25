package ejerciciosPropuestos2;

public class Libro {

	private String titulo;
	private String autor;
	
	public Libro() {}
	
	public Libro(String titulo,String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo=titulo;
	}
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		
		return this.autor;
	}
}
