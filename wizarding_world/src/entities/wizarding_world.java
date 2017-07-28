package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course flying = new Course("flying", "Madame Hooch", 'O', 1996);
		Vector<String> students = new Vector<String>();
		students.add("Harry Potter");
		students.add("Ron Weasley");
		students.add("Hermoine Granger");
		students.add("Draco Malfoy");
		flying.setStudentNames(students);
		System.out.println(flying.getStudentNames());
		
	}

}
