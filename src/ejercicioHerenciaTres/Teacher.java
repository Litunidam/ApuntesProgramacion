package ejercicioHerenciaTres;

public class Teacher extends Person {
	
	protected int idTeacher;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String surname, int age, int idTeacher) {
		super(name,surname,age);
		this.idTeacher=idTeacher;
	}
	
	public void mostrarDatos() {
		
		System.out.println(this);
		
	}
	
	
	public String toString() {
		return super.toString() + " ID: "+idTeacher;
	}
}
