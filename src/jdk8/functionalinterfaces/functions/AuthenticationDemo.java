package jdk8.functionalinterfaces.functions;

import java.util.Scanner;
import java.util.function.Function; 

public class AuthenticationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String user = sc.next();
		System.out.println("Enter the password");
		String pass = sc.next();
		
		Function<String , String> authfun1 = s-> s.substring(0,5);
		Function<String , String> authfun2 = s-> s.toLowerCase();
		
		if(authfun1.andThen(authfun2).apply(user).equals("dipak") && pass.equals("dipak@123")) {
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}
		
		

	}

}
