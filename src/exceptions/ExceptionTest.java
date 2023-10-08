package exceptions;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	TooYoungException(String s) {
		super(s);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}

class ExceptionTest {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the age");	
	int age=scanner.nextInt();
if(age>60)
	{
		throw new TooYoungException("please wait some more time.... u will get best match");
	}
else if(age<18)
	{
		throw new TooOldException("u r age already crossed....no chance of getting married");
	}
else
	{
		System.out.println("you will get match details soon by e-mail");
	}
  }
}