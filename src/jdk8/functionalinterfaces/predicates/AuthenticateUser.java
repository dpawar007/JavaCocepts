package jdk8.functionalinterfaces.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String name;
	String pass;

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}
}

public class AuthenticateUser {
	public static void main(String[] args) {
		Predicate<User> predicate = user -> user.name.equals("dipak") && user.pass.equals("dipak@123");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter user name");
			String userName = sc.next();
			System.out.println("enter user password");
			String password = sc.next();
			User user = new User(userName, password);
			if (predicate.test(user)) {
				System.out.println("Welcome!!! valid user");
			} else {
				System.out.println("Invalid user !!!");
			}
		}
	}
}
