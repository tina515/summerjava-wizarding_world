package entities;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person harry = new Person("harry");
		harry.setSchool("hogwarts");
		harry.setHouseName("gryffendor");
		harry.setBloodStatus("pure blood");
		System.out.println(harry.getBloodStatus());
	}

}
