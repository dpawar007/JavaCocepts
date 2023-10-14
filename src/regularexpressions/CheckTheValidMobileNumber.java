package regularexpressions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTheValidMobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number");
		String mobileno = sc.next();
		//Pattern pattern = Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");		
		//Pattern pattern = Pattern.compile("[7-9][0-9]{9}");
		Pattern pattern = Pattern.compile("^[789][0-9]{9}$");
		Matcher matcher = pattern.matcher(mobileno);
		//if (matcher.find() && matcher.group().equals(Arrays.asList(mobileno))) {
		if (matcher.matches()) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}
}
