package jdk8.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
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

public class DisplayStudentInformation {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		populate(s);

		Predicate<Student> ps = student -> student.marks >= 60;
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

		Consumer<Student> c = stu -> {
			System.out.println("Student name : " + stu.name);
			System.out.println("Student marks : " + stu.marks);
			System.out.println("Student grade : " + function.apply(stu));
			System.out.println();
		};

		for (Student s1 : s) {
		//	if (ps.test(s1)) {
				c.accept(s1);
		//	}
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