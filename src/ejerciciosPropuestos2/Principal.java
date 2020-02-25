package ejerciciosPropuestos2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el título del libro");
		String titulo1=s.nextLine();
		System.out.println("Introduzca el nombre del autor");
		String autor1=s.nextLine();
		
		Libro l1=new Libro();
		l1.setTitulo(titulo1);
		l1.setAutor(autor1);
		
		Biblioteca b1=new Biblioteca(l1,10);
		
		System.out.println("Introduzca el título del libro");
		String titulo2=s.nextLine();
		System.out.println("Introduzca el nombre del autor");
		String autor2=s.nextLine();
		
		Libro l2=new Libro();
		
		l2.setTitulo(titulo2);
		l2.setAutor(autor2);
		
		Biblioteca b2=new Biblioteca(l2,10);
		
		Libro l3 = new Libro("titulo3","autor3");
		Libro l4 = new Libro("titlulo4","autor4");
		
		
	}
}
