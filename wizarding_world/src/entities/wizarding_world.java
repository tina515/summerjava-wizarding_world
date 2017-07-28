package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Potions");
		courses.add("Divination");
		courses.add("Magical Creatures");
		courses.add("Defense Against The Dark Arts");
		courses.add("Transfiguration");
		courses.add("Charms");
		courses.add("Astronomy");
		courses.add("Flying");
		courses.add("Herbology");
		courses.add("History of Magic");

		School hogwarts = new School("Hogwarts");
		hogwarts.setCourseNames(courses);
		System.out.println(hogwarts.getCourseNames());
	}

}
