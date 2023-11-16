package jdk8.functionalinterfaces.predicates;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Employee {
	String name;
	String designaton;
	double salary;
	String city;

	public Employee(String name, String designaton, double salary, String city) {
		this.name = name;
		this.designaton = designaton;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %.2f, %s)", name, designaton, salary, city);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, designaton, name, salary);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		
//		return    Objects.equals(city, other.city)
//				 && Objects.equals(designaton, other.designaton) 
//				 && Objects.equals(name, other.name)
//				 && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}
	
	@Override
	public boolean equals(Object obj) {
		 Employee e = (Employee) obj;
		 if(name.equals(e.name) && city.equals(e.city) && salary == e.salary && designaton.equals(e.designaton)) {
			 return true;
		 }else {
			 return false;
		 }
	}

	 	  
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		populateList(employees);
		System.out.println(employees);
		Predicate<Employee> p1 = emp -> emp.designaton.equals("SDE1");
		System.out.println("All employees of designation SDE1");
		dispaly(p1, employees);

		Predicate<Employee> p2 = emp -> emp.city.equals("pune");
		System.out.println("All employees of banglore location");
		dispaly(p2, employees);
		 
		
		Predicate<Employee> p3 = emp -> emp.salary < 20000;
		System.out.println("All employees of salary less than 2000");
		dispaly(p3, employees);	
		 
		Predicate<Employee> p4 = emp -> emp.designaton.equals("TL");
		System.out.println("Person is TL and location pune");
		dispaly(p2.and(p4), employees);
		
		
		System.out.println("All employees are not TL");
		dispaly(p4.negate(), employees);
		
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("diapk_pawar", "CEO", 7000000, "pune"));
		
		Employee emp1 = new Employee("diapk", "SDE2", 150000, "pune");
		Employee emp2 = new Employee("diapk_pawar", "CEO", 7000000, "pune");
		
		System.out.println(isCEO.test(emp1));
		System.out.println(isCEO.test(emp2));

	}

	public static void populateList(ArrayList<Employee> empList) {
		empList.add(new Employee("diapk", "SDE2", 150000, "pune"));
		empList.add(new Employee("akash", "SDE2", 160000, "banglore"));
		empList.add(new Employee("rupesh", "SDE3", 170000, "mumbai"));
		empList.add(new Employee("chetan", "TL", 170000, "pune"));
		empList.add(new Employee("ramesh", "SDE1", 19000, "pune"));
		empList.add(new Employee("chaman", "SDE1", 25000, "pune"));
		empList.add(new Employee("amol", "QA1", 17000, "pune"));
	}

	public static void dispaly(Predicate<Employee> pemp, ArrayList<Employee> emplist) {
		for (Employee e : emplist) {
			if (pemp.test(e))
				System.out.println(e);
		}
	}
}
