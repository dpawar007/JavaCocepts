package jdk8.timedate;

import java.time.LocalDate;
import java.time.LocalTime;

public class SystemDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current date : " + date);

		// formatted date

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();

		System.out.println("Formatted Date : " + dd + ".." + mm + ".." + yyyy);
		System.out.printf("Another Format :-  %d-%d-%d", dd, mm, yyyy);
		System.out.println();

		LocalTime time = LocalTime.now();
		System.out.println("Current time : " + time);

		// formatted time

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.println();
		System.out.printf("Time Format :- %d-%d-%d-%d", h, m, s, n);
	}

}
