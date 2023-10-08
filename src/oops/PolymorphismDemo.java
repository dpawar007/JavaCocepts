package oops;

import java.text.DateFormat;

public class PolymorphismDemo implements Cloneable{

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		PolymorphismDemo demo = new PolymorphismDemo();		 
		PolymorphismDemo demo2 = (PolymorphismDemo) demo.clone();

		System.out.println(demo);
		System.out.println(demo2);
		
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
		 

	}

}
