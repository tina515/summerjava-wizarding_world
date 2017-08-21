package entities;
import services.*;
import java.util.*;

public class wizarding_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SchoolService schools = new SchoolService();
	schools.getData("SchoolDB.txt");
	
	}
}
