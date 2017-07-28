package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course flying = new Course("flying", "Madame Hooch", 'O', 1996);
		System.out.println(flying.getName());
		System.out.println(flying.getMinGrade());
		flying.setName("professional flying");
		flying.setMinGrade('5');
		System.out.println(flying.getName());
		System.out.println(flying.getMinGrade());
	}

}
