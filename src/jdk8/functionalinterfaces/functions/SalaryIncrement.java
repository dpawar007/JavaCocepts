package jdk8.functionalinterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		populate(empList);
		System.out.println(empList);

		Function<ArrayList<Employee>, Double> f = emp -> {
			double total = 0;
			for (Employee e : emp) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("Total employee salary : " + f.apply(empList));

		Predicate<Employee> preemp = e -> e.salary > 20000;
		Function<Employee, Employee> funemp = e -> {
			e.salary = e.salary + 5000;
			return e;
		};

		ArrayList<Employee> empNewList = new ArrayList<Employee>();

		for (Employee e : empList) {
			System.out.println(preemp.test(e));
			if (preemp.test(e)) {
				funemp.apply(e);
				empNewList.add(funemp.apply(e));
			}
		}

		System.out.println("Employees after salary increment");
		System.out.println(empNewList);
		System.out.println("All Employeed after salary increment");
		System.out.println(empList);
	}

	private static void populate(ArrayList<Employee> arrayList) {
		arrayList.add(new Employee("sunny", 10000));
		arrayList.add(new Employee("Bunny", 20000));
		arrayList.add(new Employee("Chinny", 30000));
		arrayList.add(new Employee("Pinny", 25000));
		arrayList.add(new Employee("Vinny", 20000));
	}

}
