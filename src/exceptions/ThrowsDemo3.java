package exceptions;

import java.util.Date;

public class ThrowsDemo3 {

	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException {
		 System.out.println("Before Thred.sleep() "+new Date(). getSeconds());
		 Thread.sleep(5000);
		 System.out.println("After Thred.sleep() "+new Date().getSeconds());
	}

	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}
}
