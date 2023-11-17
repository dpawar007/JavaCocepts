package jdk8.functionalinterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FindStudentGrade {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		populate(s);
		Function<Student, String> function = st -> {
			int marks = st.marks;
			if (marks >= 80)
				return "A";
			else if (marks >= 60)
				return "B";
			else if (marks >= 50)
				return "C";
			else if (marks >= 35)
				return "D";
			else
				return "Failed";
		};

		for (Student s1 : s) {
			System.out.println("Student name : " + s1.name);
			System.out.println("Student marks : " + s1.marks);
			System.out.println("Student grade : " + function.apply(s1));
			System.out.println();
		}
		
		System.out.println("Students whose marks greater than equal to 60");

		Predicate<Student> ps = student -> student.marks >= 60;
		for (Student s1 : s) {
			if (ps.test(s1)) {
				System.out.println("Student name : " + s1.name);
				System.out.println("Student marks : " + s1.marks);
				System.out.println("Student grade : " + function.apply(s1));
				System.out.println();
			}
		}

	}

	private static void populate(ArrayList<Student> s) {
		s.add(new Student("diapk", 70));
		s.add(new Student("kiran", 80));
		s.add(new Student("pravin", 50));
		s.add(new Student("dhiraj", 40));
		s.add(new Student("chaman", 34));
	}	 
}
