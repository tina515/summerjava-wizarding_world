package entities;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School hogwarts = new School("Hogwarts");
		System.out.println(hogwarts.getName());
		hogwarts.setName("sometging else");
		System.out.println(hogwarts.getName());
	}

}
