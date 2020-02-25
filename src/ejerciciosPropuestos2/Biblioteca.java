package ejerciciosPropuestos2;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro>libros=new ArrayList<>();
	private ArrayList<Integer>ejemplares=new ArrayList<>();
	private ArrayList<Integer>prestados=new ArrayList<>();
	
	public Biblioteca() {}
	
	public Biblioteca(Libro libro,int ejemplar) {
		libros.add(libro);
		ejemplares.add(ejemplar);
		prestados.add(0);
	}
	public void addLibro(Libro libro,int ejemplar) {
		
		libros.add(libro);
		ejemplares.add(ejemplar);
		prestados.add(0);
	}
	
	public boolean prestamo(Libro l) {
		
		if (ejemplares.get(libros.indexOf(l))-prestados.get(libros.indexOf(l))>0) {
			
			prestados.set(libros.indexOf(l),prestados.get(libros.indexOf(l))+1);
			return true;
			
		}
			
		return false;
	}
	
	public boolean devolucion(Libro l) {
		
		if(prestados.indexOf(l)>0) {
			prestados.set(libros.indexOf(l),prestados.get(libros.indexOf(l))-1);
			
			return true;
		}else {
			return false;
		}
	}

}
