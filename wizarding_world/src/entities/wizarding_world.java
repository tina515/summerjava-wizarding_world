package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> students = new Vector<String>();
		students.add("Harry Potter");
		students.add("Luna Lovegood");
		students.add("Lucius Malfoy");
		School hogwarts = new School("Hogwarts");
		hogwarts.setStudentNames(students);
		System.out.println(hogwarts.getStudentNames());
	}

}
