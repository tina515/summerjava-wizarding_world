package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> professors = new Vector<String>();
		professors.add("Severus Snape");
		professors.add("Albus Dumbledore");
		professors.add("Minerva McGonnagol");
		School hogwarts = new School("Hogwarts");
		hogwarts.setProfessorNames(professors);
		System.out.println(hogwarts.getProfessorNames());
	}

}
