package jdk8.functionalinterfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	//Return the system date
	public static void main(String[] args) {
		Supplier<Date> d = () -> new Date();
		System.out.println(d.get());
	}
}
