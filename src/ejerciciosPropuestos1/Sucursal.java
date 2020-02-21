package ejerciciosPropuestos1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sucursal {

	private ArrayList<CuentaCorriente>cuentas;
	
	public Sucursal(CuentaCorriente cliente1,CuentaCorriente cliente2,CuentaCorriente cliente3) {
		
		cuentas=new ArrayList<>();
		cuentas.add(cliente1);
		cuentas.add(cliente2);
		cuentas.add(cliente3);
	}
	
	public void operar() {
		Scanner s = new Scanner(System.in);
				
		System.out.println("¿Desea consultar un cliente? si/no");
		if (s.nextLine().equals("si")) {
			System.out.println("Introduzca el cliente:");
			obtenerCliente(s.nextLine());
		}
		
	}
	public void obtenerCliente(String cliente) {
		boolean encontrado=false;
		for (CuentaCorriente x:cuentas) {
			if(x.getCliente().equals(cliente)) {
				encontrado=true;
				menu(x);
			}
		}
		if (encontrado) {
			System.out.println("No he encontrado al cliente");
		}
		
		
	}
	public void menu(CuentaCorriente cliente) {
		Scanner s = new Scanner(System.in);
		System.out.println("1.-Ingresar");
		System.out.println("2.-Extraer");
		System.out.println("3.-Mostrar Saldo");
		System.out.println("4.-Salir");
		
		System.out.println("Introduzca un número");
		
		switch(s.nextInt()) {
			case 1:
				cliente.ingresar(s.nextDouble());
				break;
			case 2:
				cliente.retirar(s.nextDouble());
				break;
			case 3:
				System.out.println(cliente.getCantidad());
				break;
			case 4:
				break;
			default:
				break;
		}
		
		
		
	}
}
