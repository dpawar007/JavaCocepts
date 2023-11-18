package jdk8.timedate;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class PeriodYearDemo {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1996, 7, 7);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d Years %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());

		LocalDate deathday = LocalDate.of(1996 + 70, 7, 7);
		Period p1 = Period.between(today, deathday);
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.printf("\nYou will be on the earth only %d Days ..args Hurry up to the more imp word", d);

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the year");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if (y.isLeap()) {			 
			System.out.println("Year is Leap Year " + y);
		} else {			 
			System.out.println("Year is Not Leap Year " + y);
		}

	}

}
