package entities;
import java.util.*;



public class Person {
	private String name;
	private boolean is_female;
	private String house_name;
	private String blood_status;
	private String school;
	private String job;
	private Date birthday;
	public Person(String _name,boolean _is_female , String _house_name , 
			String _blood_status , String _school ,String _job, Date _birthday)
	{
		name = _name;
		is_female = _is_female;
		house_name = _house_name;
		blood_status = _blood_status;
		school = _school;
		job = _job;
		birthday = _birthday;
	}
	public Person(String _name , String _house_name , 
			String _blood_status , String _school ,Date _birthday)
	{
		name = _name;
		is_female = false;
		house_name = _house_name;
		blood_status = _blood_status;
		school = _school;
		job = "not assigned";
		birthday = _birthday;
	}
	public Person(String _name)
	{
		name = _name;
		is_female = false;
		house_name = "not defined";
		blood_status = "not defined";
		school = "not defined";
		job = "not assigned";
		//birthday = ;
	}
	public void set_name(String _name) {name = _name;}
	public String get_name() {return name;}
}
