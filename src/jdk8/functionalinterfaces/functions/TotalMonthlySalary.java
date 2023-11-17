package jdk8.functionalinterfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}

}

public class TotalMonthlySalary {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		populate(arrayList);
		System.out.println(arrayList);		
				
		Function<ArrayList<Employee>, Double> f = emp -> {
			double total = 0;
			for(Employee e : emp) {
				total = total+e.salary;
			}
			return total;	
		};		
		System.out.println("Total employee salary : "+f.apply(arrayList));
	}

	private static void populate(ArrayList<Employee> arrayList) {
		 arrayList.add(new Employee("sunny", 10000));
		 arrayList.add(new Employee("Bunny", 20000));
		 arrayList.add(new Employee("Chinny", 30000));
		 arrayList.add(new Employee("Pinny", 25000));
		 arrayList.add(new Employee("Vinny", 20000));		
	}

}
