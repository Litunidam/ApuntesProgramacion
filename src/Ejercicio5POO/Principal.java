package Ejercicio5POO;

import java.util.Scanner;

public class Principal {
	private static Scanner s = new Scanner(System.in);
	private static ListaDeActores l;
	
	public static void menu() {

		int option;
		do {
			System.out.println();
			System.out.println("1) Para agregar Nombres");
			System.out.println("2) Para modificar Nombres");
			System.out.println("3) Para borrar Nombres");
			System.out.println("4) Para buscar Nombre y en que posición esta");
			System.out.println("5) Para visualizar Nombres");
			System.out.println("6) Cantidad de actores");
			System.out.println("7) Salir");
			System.out.println("-----------------------------------------------");
			System.out.println("Seleccione opción:");

			option = s.nextInt();

		} while (option < 1 && option > 7);
		s.nextLine();

		comenzar(option);
	}

	public static void comenzar(int option) {

		switch (option) {
		case 1:
			System.out.println("Introduzca el nombre a insertar:");
			l.setNombre(s.nextLine());
			break;
		case 2:
			System.out.println("Introduzca el nombre que quieres modificar:");
			String p = s.nextLine();
			System.out.println("Ahora introduzca el nuevo nombre");
			l.changeNombre(p, s.nextLine());
			break;
		case 3:
			System.out.println("Inserte el nombre que quieras borrar");
			l.deleteNombre(s.nextLine());
			break;
		case 4:
			System.out.println("Inserte el nombre para saber su posición");
		
			int position = l.searchNombre(s.nextLine());
			break;
		case 5:
			l.showNombres();
			break;
		case 6:
			int cantidad = l.countNombres();
			break;
		default:
			break;

		}

	}

	public static void main(String[] args) {

		l=new ListaDeActores();

		menu();

	}
}
