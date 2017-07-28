package entities;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> houses = new ArrayList<String>();
		houses.add("Gryffindor");
		houses.add("Hufflepuff");
		houses.add("Ravenclaw");
		houses.add("Slytherin");
		School hogwarts = new School("Hogwarts", houses, null, true, null, null);
		System.out.println(hogwarts.getHouseNames());
		ArrayList<String> _houses = new ArrayList<String>();
		_houses.add("Gryffindor");
		_houses.add("Hufflepuff");
		_houses.add("Ravenclaw");
		_houses.add("Slytherin");
		School hogwarts2 = new School("Hogwarts");
		hogwarts2.setHouseNames(_houses);
		System.out.println(hogwarts2.getHouseNames());
	}

}
