package ejercicioHerenciaTres;

import java.util.Date;

public class Temporary extends Teacher {

	private Date startDate;
	
	public Temporary(String name, String surname, int age, int idTeacher,Date startDate) {
		
		super(name,surname,age,idTeacher);
		this.startDate = startDate; 
		
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Fecha de inicio: "+this.startDate;
	}
}
