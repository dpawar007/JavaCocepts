package jdk8.functionalinterfaces.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
	String name;
	int rollNo;
	
	public Student(String name, int rollNo) {	 
		this.name = name;
		this.rollNo = rollNo;
	}
	
}
public class BiFunctionStudent {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		BiFunction<String, Integer, Student>  f = (name,rollno) -> new Student(name,rollno);
		students.add(f.apply("diapk", 2));
		students.add(f.apply("kiran", 4));
		students.add(f.apply("chaman", 7));
		students.add(f.apply("raman", 1));
		
		
		for(Student s: students) {
			System.out.println("Student Name :  "+s.name);
			System.out.println("Student Roll No : "+s.rollNo);
			System.out.println();
		}

	}

}
