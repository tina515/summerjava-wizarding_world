package services;
import entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SchoolService {
	private Vector<School> allSchools;
	public SchoolService()
	{
		allSchools = new Vector<School> ();
	}
	public void getData(String fileName) 
	{
		try {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
		    //StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != "$") {
		        String schoolName = line;
		        line = br.readLine();
		        boolean housed = false;
		        ArrayList <House> houses = new ArrayList <House> ();
		        if(line != "N/A")
		        {
		        		int numberOfHouses = Integer.parseInt(line);
		        		
		        		if(numberOfHouses > 0)
		        			housed = true;
		        		
		        		for(int i = 0; i<numberOfHouses ; i++)
		        		{
		        			line = br.readLine();
		        			houses.add(new House(line));
		        		}
		        }
		        line = br.readLine();
		    		int numberOfStudents = Integer.parseInt(line);
		    		Vector<Student> students = new Vector<Student>();
		    		for(int i = 0 ; i<numberOfStudents ; i++)
		    		{
		    			line = br.readLine();
		    			students.add(new Student(line));
		    		}
		    		line = br.readLine();
	        		int numberOfProfessors = Integer.parseInt(line);
	        		Vector<Professor> professors = new Vector<Professor> ();
	        		for(int i = 0 ; i< numberOfProfessors ; i++)
	        		{
	        			line = br.readLine();
	        			professors.add(new Professor(line));
	        		}
	        		line = br.readLine();
	        		int numberOfCourses = Integer.parseInt(line);
	        		ArrayList <Course> courses = new ArrayList<Course> ();
	        		for(int i = 0 ; i< numberOfCourses ; i++)
	        		{
	        			line = br.readLine();
	        			courses.add(new Course(line));
	        		}
	        		line = br.readLine();
	        		String location = line;
	        		
	        		allSchools.add(new School(schoolName,numberOfStudents,housed,houses,students,professors,courses,location));
		        	line = br.readLine();
		        line = br.readLine();
		    }
		   // String everything = sb.toString();
		} finally {
		    br.close();
		    System.out.println("file closed");
		}
		}catch(IOException e)
		{
			System.out.println("not done");
		}
	}
	public void setData()
	{
		try{
		    PrintWriter writer = new PrintWriter("schoolDB_setdata.txt", "UTF-8");
		    //writer.println("The first line");
		    for(int i = 0 ; i< allSchools.size() ; i++)
		    {
		    		String name = allSchools.get(i).getName();
		    		writer.println(name);
		    		if(allSchools.get(i).getHoused())
		    		{
		    			for(int j = 0 ; j<allSchools.get(i).getHouses().size() ; j++)
		    			{
		    				String houseName = allSchools.get(i).getHouses().get(j).getName();
		    				writer.println(houseName);
		    			}
		    		}
		    		else
		    		{
		    			writer.println("N/A");
		    		}
		    		for(int j = 0 ; j< allSchools.get(i).getNumOfStudents() ; j++)
		    		{
		    			String studentName = allSchools.get(i).getStudents().get(j).getName();
		    			writer.println(studentName);
		    		}
		    		for(int j = 0 ; j<allSchools.get(i).getProfessors().size() ; j++)
		    		{
		    			String professorName = allSchools.get(i).getProfessors().get(j).getName();
		    			writer.println(professorName);
		    		}
		    		for(int j = 0 ; j<allSchools.get(i).getCourses().size() ; j++)
		    		{
		    			String courseName = allSchools.get(i).getCourses().get(j).getName();
		    			writer.println(courseName);
		    		}
		    		String location = allSchools.get(i).getLocation();
		    		writer.println(location);
		    		writer.println("*");
		    }
		    writer.println("$");
		    writer.close();
		} catch (IOException e) {
		   System.out.println("not done");
		}
	}
}
