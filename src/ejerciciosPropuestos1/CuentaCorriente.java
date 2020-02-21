package ejerciciosPropuestos1;

public class CuentaCorriente {
	
	private String cliente;
	private double cantidad;

	
	public CuentaCorriente(String cliente) {
		
		this.cliente=cliente;
		this.cantidad=0;	
	}
	public CuentaCorriente(String cliente,double cantidad) {
		
		this.cliente=cliente;
		this.cantidad=cantidad;
	}
	
	public void ingresar(double cantidad) {
		
		this.cantidad+=cantidad;
	}

	public void retirar(double cantidad) {
		this.cantidad-=cantidad;
	}
	
	public void setCliente(String cliente) {
		this.cliente=cliente;
	}
	public String getCliente() {
		
		return this.cliente;
	}
	
	public void setCantidad(double cantidad) {
		
		this.cantidad=cantidad;
	}
	public double getCantidad() {
		
		return this.cantidad;
	}
	
	
}
