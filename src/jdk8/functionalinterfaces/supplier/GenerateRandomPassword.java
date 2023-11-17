package jdk8.functionalinterfaces.supplier;

import java.util.function.Supplier;

//length should be 8 characters
//2,3,4,8 places  only digit
//1,3,5,7 places only upperCase alphabet symbols and special characters.

public class GenerateRandomPassword {
	public static void main(String[] args) {
	// for (int a = 0; a < 99; a++) {
			Supplier<Integer> p = () -> (int) (Math.random() * 10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 10));
			StringBuilder pwd = new StringBuilder();
			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					pwd.append(p.get());
				} else {
					pwd.append(c.get());
				}
			}
			System.out.println(pwd);
	//	}
	}
}
