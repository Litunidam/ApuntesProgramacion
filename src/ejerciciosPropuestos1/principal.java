package ejerciciosPropuestos1;

public class principal {
	public static void mani(String[] args) {
		CuentaCorriente cliente1=new CuentaCorriente("Carmen",1000);
		CuentaCorriente	cliente2=new CuentaCorriente("Félix",2000);
		CuentaCorriente cliente3=new CuentaCorriente("Eugenia",300);
		
		Sucursal cuentas=new Sucursal(cliente1,cliente2,cliente3);
		
	}
}
