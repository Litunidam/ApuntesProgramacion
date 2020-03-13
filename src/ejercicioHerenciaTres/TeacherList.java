package ejercicioHerenciaTres;

import java.util.ArrayList;

public class TeacherList {

	private ArrayList<Teacher> teachers = new ArrayList<>();
	
	public TeacherList() {
		
	}
	
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}
	
	public void listing() {
		for (Teacher t: this.teachers) {
			t.mostrarDatos();
		}
	}
	
	
}
