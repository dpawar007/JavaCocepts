package basic.strings;

import java.util.Scanner;

public class ReverseStringWOFun {

	public static void main(String[] args) {
		 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a String");
			String ip = sc.nextLine();
			System.out.println("Here is your Enter String : "+ip);
			StringBuffer sb = new StringBuffer();
			System.out.println("String Length "+ip.length());
			for (int i =ip.length()-1; 0<=i; i-- ) {			
				sb.append(ip.charAt(i));
			}
			System.out.println("Here Your Reverse String  = "+sb.toString());
		}
	}

}
