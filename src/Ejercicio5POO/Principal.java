package Ejercicio5POO;

import java.util.Scanner;

public class Principal {
	private static Scanner s = new Scanner(System.in);
	public static void menu(ListaDeActores l) {
		
		int option;
		do{
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
		
		option=s.nextInt();
		
		}while(option<1 && option>7);
		s.nextLine();
		
		comenzar(option,l);
	}
	
	public static void comenzar(int option,ListaDeActores l) {
	
		switch (option) {
			case 1:
				System.out.println("Introduzca el nombre a insertar:");
				String c=s.nextLine();
				l.setNombre(c);
				break;
			case 2:
				System.out.println("Introduzca el nombre que quieres modificar:");
				String p=s.nextLine();
				System.out.println("Ahora introduzca el nuevo nombre");
				String np=s.nextLine();
				l.changeNombre(p, np);
				break;
			case 3:
				System.out.println("Inserte el nombre que quieras borrar");
				String n=s.nextLine();
				l.deleteNombre(n);
				break;
			case 4:
				System.out.println("Inserte el nombre para saber su posición");
				String buscar=s.nextLine();
				int position=l.searchNombre(buscar);
				break;
			case 5:
				l.showNombres();
				break;
			case 6:
				int cantidad = l.countNombres();
				break;
			case 7:
				break;
		
		}
		
	}
	public static void main(String[] args) {
		
		ListaDeActores l = new ListaDeActores();
		
		menu(l);
		
		
		
	}
	
}
