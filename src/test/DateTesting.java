package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTesting {

	public static void main(String[] args) throws ParseException {
		Date todayDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Date compareDate = dateFormat.parse("2023-10-29T14:00:48.632Z");		 
		System.out.println(todayDate.compareTo(compareDate));
		if (todayDate.compareTo(compareDate)>0) {
			System.out.println("Today Date");
		} else {
			System.out.println("Other Date");
		}

	}

}
