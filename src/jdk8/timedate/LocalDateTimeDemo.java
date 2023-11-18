package jdk8.timedate;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();

		System.out.println();
		System.out.printf("Date : %d-%d-%d", dd, mm, yy);

		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		System.out.println();
		System.out.printf("Time : %d-%d-%d", h, m, s);

		System.out.println("In Some format both date&Time");
		LocalDateTime dt1 = LocalDateTime.of(yy, mm, dd, h, m);
		System.out.println(dt1);

		System.out.println("After Six Months: " + dt.plusMonths(6));
		System.out.println("Before Six Months: " + dt.minusMonths(6));

	}
}
