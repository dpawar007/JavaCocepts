package regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTheValidMailID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mail Id");
		String mobileno = sc.next();		 
		Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9-.]*@gmail[.]com");
		Matcher matcher = pattern.matcher(mobileno);		
		if (matcher.matches()) {
			System.out.println("Valid Mail Id");
		} else {
			System.out.println("Invalid Mail Id");
		}
	}

}
