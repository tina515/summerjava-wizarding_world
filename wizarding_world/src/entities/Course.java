package entities;
import java.util.*;
public class Course {
	private String name;
	private char minGrade;
	private String professorName;
	private int year;
	private Vector<String> studentNames; 
	public Course(String _name , String _professorName, char _minGrade,int _year)
	{
		name = _name;
		professorName = _professorName;
		minGrade = _minGrade;
		year = _year;
		studentNames = null;
	}
	public Course(String _name)
	{
		name = _name;
		professorName = "";
		minGrade = '0';
		year = 0;
		studentNames = null;
	}
	public Course(String _name , String _professorName, char _minGrade,int _year
			,Vector <String> _students)
	{
		name = _name;
		professorName = _professorName;
		minGrade = _minGrade;
		year = _year;
		studentNames = _students;
	}
	public void setName(String _name) { name = _name;}
	public String getName() {return name;}
	public char getMinGrade() { return minGrade;}
	public void setMinGrade(char _grade) { minGrade = _grade;}
	public void setProfessorName(String _name) { professorName = _name;}
	public String getProfessorName() {return professorName;}
}

