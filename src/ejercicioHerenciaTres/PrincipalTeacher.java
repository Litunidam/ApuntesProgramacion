package ejercicioHerenciaTres;

public class PrincipalTeacher extends Teacher {
	
	protected double career;
	
	public PrincipalTeacher(String name, String surname, int age, int idTeacher,int career) {
		
		super(name,surname,age,idTeacher);
		this.career=career;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Antigüedad: "+this.career;
				
	}
}
