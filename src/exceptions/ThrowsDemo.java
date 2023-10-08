package exceptions;

import java.util.Date;

public class ThrowsDemo {

	public static void main(String[] args) throws  InterruptedException{
		System.out.println("Before sleep "+new Date());
		Thread.sleep(5000);			
		System.out.println("After sleep "+new Date());
	}

}
