package entities;
import java.util.*;
public class School {
	private String name;
	private int numOfStudents;
	private boolean housed;
	private ArrayList<String> houseNames;
	private Vector<String> studentNames;
	private Vector<String> professorNames;
	private ArrayList<String> courseNames;
	private String schoolPrinciple;
	public School(String _name)
	{
		name = _name;
		numOfStudents = 0;
		housed = false;
		houseNames = null;
		studentNames = null;
		professorNames = null;
		courseNames = null;
		schoolPrinciple = "";
	}
	public School(String _name, int _numOfStudents, boolean _housed, ArrayList<String> _houseNames
			,Vector<String> _studentNames, Vector<String> _professorNames,
				ArrayList<String> _courseNames)
	{
		name = _name;
		numOfStudents = _numOfStudents;
		housed = _housed;
		houseNames = _houseNames;
		studentNames = _studentNames;
		professorNames = _professorNames;
		courseNames = _courseNames;
		schoolPrinciple = "";
	}
	public School(String _name, int _numOfStudents, boolean _housed, ArrayList<String> _houseNames
			,Vector<String> _studentNames, Vector<String> _professorNames,
				ArrayList<String> _courseNames , String _principle)
	{
		name = _name;
		numOfStudents = _numOfStudents;
		housed = _housed;
		houseNames = _houseNames;
		studentNames = _studentNames;
		professorNames = _professorNames;
		courseNames = _courseNames;
		schoolPrinciple = _principle;
	}	
	public void setName(String _name) { name = _name;}
	public String getName() { return name;}
	public void setHoused(boolean _housed) {housed = _housed;}
	public boolean getHoused() {return housed;}
}
