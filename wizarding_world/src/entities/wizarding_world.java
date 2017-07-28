package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course flying = new Course("flying", "Madame Hooch", 'O', 1996);
		System.out.println(flying.getProfessorName());
		flying.setProfessorName("viktor krum");
		System.out.println(flying.getProfessorName());
		
	}

}
