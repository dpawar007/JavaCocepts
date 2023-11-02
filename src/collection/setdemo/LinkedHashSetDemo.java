package collection.setdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<>(); // Created Empty LinkedHashset object with default initial capacity of 16
													// Default Fill Ratio 0.75	 
		for (int i = 0; i <= 12; i++)
			linkedhashSet.add(i);

		System.out.println(linkedhashSet);
 		System.out.println(linkedhashSet.size());
	}

}
