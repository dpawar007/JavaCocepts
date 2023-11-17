package jdk8.functionalinterfaces.bifunction;

import java.util.function.BiFunction;

class Employee {
	int eno;
	String name;
	double dailyWage;

	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}

}

class TimeSheet {
	int eno;
	int days;

	public TimeSheet(int eno, int days) {
		this.eno = eno;
		this.days = days;
	}

}

public class MonthlySalaryCalculation {

	public static void main(String[] args) {
		BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
		Employee e = new Employee(101, "dipak", 2700);
		TimeSheet t = new TimeSheet(101, 27);

		System.out.println("Employee Monthly Salary : " + f.apply(e, t));

	}

}
