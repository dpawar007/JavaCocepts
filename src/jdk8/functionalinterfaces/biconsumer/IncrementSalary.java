package jdk8.functionalinterfaces.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class IncrementSalary {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);

		l.add(f.apply("durga", 1000.0));
		l.add(f.apply("dipak", 2000.0));
		l.add(f.apply("kiran", 3000.0));
		l.add(f.apply("ranga", 2000.0));

		BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;

		for (Employee e : l) {
			c.accept(e, 500.0);
		}

		for (Employee e : l) {
			System.out.println("Emplyee Name : " + e.name);
			System.out.println("Employee Salary : " + e.salary);
			System.out.println();
		}

	}

}