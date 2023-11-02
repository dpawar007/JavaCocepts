package collection.listdemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>(); // Created default initial capacity 10 //New Capacity = Current Capacity * 2
		Vector<String> v1 = new Vector<>(15); // Created with new initial capacity

		System.out.println("==================--Vector Specific,Collectiona and List Methods--====================");
		v.add("diapk");//Collection
		v.add(0,"vijay");//List
		v.addElement("kiran");//Vector
		System.out.println("Vector => "+v);
		System.out.println("Check the capacity => "+v.capacity());
		
		for(int i=0;i<=7;i++)
		v.addElement(i+"");	
		System.out.println("Check the size => "+v.size());
		System.out.println("Check the capacity => "+v.capacity());
		
		
		
	}

}
