package entities;
import java.util.*;
public class House {

	private String name;
	private School school;
	private Vector<Student> students;
	private Professor headTeacher;
	private ArrayList<String> qualities;
	private Map<Integer ,Student> perfects;
	public House(String _name)
	{
		name = _name;
		school = null;
		students = null;
		headTecher = null;
		qualities = null;
		perfects = null;
	}
	public House(String _name , School _school)

	{
		name = _name;
		school = _school;
		students = null;
		headTecher = null;
		qualities = null;
		perfects = null;
	}
	public House(String _name , School _school , Vector<Student> _students , Professor _headTeacher,ArrayList<String> _qualities , Map<Integer , Student> _perfects)
	{
		name = _name;
		school = _school;
		students = _students;
		headTecher = _headTeacher;
		qualities = _qualities;
		perfects = _perfects;
	}
	public House(String _name , School _school , Vector<Student> _students , Professor _headTeacher,ArrayList<String> _qualities)
	{
		name = _name;
		school = _school;
		students = _students;
		headTecher = _headTeacher;
		qualities = _qualities;
		perfects = null;
	}
	public House(String _name , School _school , Vector<Student> _students , Professor _headTeacher)
	{
		name = _name;
		school = _school;
		students = _students;
		headTecher = _headTeacher;
		qualities = null;
		perfects = null;
	}
	public String getName() { return name;}
	public void setName(String _name) { name = _name; }
	public School getSchool() { return school ;}
	public void setSchool(School _school) { school = _school;}
	public Vector<Student> getStudents() { return students;}
	public void setStudnets( Vector<Studnet> _students) { students = _students ;}
	public Professor getProfessor() { return headTeacher; }
	public void setProfessor(Professor _newHead) { headTeacher = _newHead ;}
	public ArrayList<String> getQualities() { return qualities;}
	public void setQualities(ArrayList<String> _qualities) { qualities = _qualities;}
	public Map<Integre,Student> getPerfects() { return perfects; }
	public void setPerfects(Map<Integre,Student> _perfects) { perfects = _perfects ;}
}
