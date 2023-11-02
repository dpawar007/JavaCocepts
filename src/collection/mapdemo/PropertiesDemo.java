package collection.mapdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo{

	public static void main(String[] args) throws IOException{
		Properties properties = new Properties();
		properties.setProperty("dipak", "diapk@123");
		properties.setProperty("kiran", "kiran@123");
		properties.setProperty("vijay", "vijay@123");
		properties.setProperty("vinod", "vinod@123");
		System.out.println(properties);		
		System.out.println(properties.getProperty("dipak"));
	
		Enumeration enumeration = properties.propertyNames();
		 while(enumeration.hasMoreElements())
			 System.out.println(enumeration.nextElement());
		 
		 FileInputStream fis = new FileInputStream("/home/dipak/git/JavaLearning/src/collections/mapdemo/prop.txt");
		 properties.load(fis);
		 System.out.println("Specific Property : "+properties.getProperty("password"));
		 System.out.println(properties);
		 
		 properties.setProperty("Dhurala", "dhur@123");
		 
		 FileOutputStream fos =  new FileOutputStream("/home/dipak/git/JavaLearning/src/collections/mapdemo/prop.txt");
		 properties.store(fos, "ObjecttoPropFile");
	}
}
