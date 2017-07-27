package entities;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person harry = new Person("harry");
		System.out.println(harry.get_name());
		harry.set_name("harry potter");
		System.out.println(harry.get_name());
	}

}
