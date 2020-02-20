package Ejercicio5POO;

import java.util.ArrayList;

public class ListaDeActores {

	private ArrayList<String> l = new ArrayList<>();

	public void setNombre(String s) {
		if (l.contains(s)) {
			System.out.println("El nombre: " + s + " ya está en la lista");
		} else {
			l.add(s);
		}
	}

	public void changeNombre(String nombreViejo, String nombreNuevo) {
		if (l.contains(nombreViejo)) {
			l.set(l.indexOf(nombreViejo), nombreNuevo);
		} else {
			System.out.println("Ese nombre no existe");
		}
	}

	public void deleteNombre(String s) {
		if (l.contains(s)) {
			l.remove(s);
		} else {
			System.out.println("Ese nombre no está en la base de datos");
		}
	}

	public int searchNombre(String s) {
		if (l.contains(s)) {

			return l.indexOf(s);

		} else {
			System.out.println("No existe ese nombre en la base de datos");
			return -1;
		}

	}

	public void showNombres() {
		for (String s : l) {
			System.out.println(s);
		}
	}

	public int countNombres() {

		return l.size();
	}

}
