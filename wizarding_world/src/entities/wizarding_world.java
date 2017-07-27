package entities;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person harry = new Person("harry");
		harry.setSchool("hogwarts");
		harry.setHouseName("gryffendor");
		System.out.println(harry.getSchool());
		System.out.println(harry.getHouseName());
	}

}
