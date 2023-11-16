package jdk8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int eno;
	String name;
	
	public Employee(int eno, String name) {
		 this.eno = eno;
		 this.name = name;
	}
	
	@Override
	public String toString() {
		 return "eno : "+eno+" name : "+name;
	}
}
public class CustomObjectSoting {
	public static void main(String[] args) {
		Employee employee = new Employee(2, "dipak");
		System.out.println(employee);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(2, "dipak"));
		employees.add(new Employee(1, "vinod"));
		employees.add(new Employee(7, "sharan"));
		employees.add(new Employee(12, "deepak"));
		employees.add(new Employee(3, "charan"));
		System.out.println(employees);
		Collections.sort(employees, (emp1, emp2) -> (emp1.eno > emp2.eno) ? -1 : (emp1.eno < emp2.eno) ? 1 : 0);
		System.out.println(employees);
		
		
		
		
	}
}

