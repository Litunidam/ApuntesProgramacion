package ejercicioHerenciaUno;

public class Employee extends Person {

	private double salary;
	private double commission;
	
	public Employee() {
		
	}
	
	public Employee(double salary,double commission) {
		this.salary=salary;
		this.commission=commission;
	}
	
	public void setSalary(double salary) {
		if (salary>0) {
			this.salary=salary;
		}else {
			System.out.println("El salario no puede ser menor que 0");
		}
	}
	
	public void setCommission(double commission) {
		if (commission>0) {
			this.commission=commission;
		}else {
			System.out.println("La comisión no puede ser menor que 0");
		}
	}
	
	public void printSalary() {
		System.out.println("El sueldo es: "+this.salary);
	}
	
	public void printCommission() {
		System.out.println("La comisión es: "+this.commission);
	}
	
	public double total() {
		return commission+salary;
	}
	
}	
