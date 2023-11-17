package jdk8.functionalinterfaces.supplier;

import java.util.function.Supplier;

public class GenerateRandomSixDigitOTP {

	public static void main(String[] args) {
		Supplier<String> number = () -> {
			String otp="";
			for(int i=0; i<6; i++) {
				otp = otp+(int) (Math.random() * 10);
			}			 
			return otp;
		};
		System.out.println(number.get());
		System.out.println((int) (Math.random() * 1000));
	}
}
