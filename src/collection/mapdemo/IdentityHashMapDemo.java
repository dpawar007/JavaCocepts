package collection.mapdemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		
		HashMap<Integer,Integer> m = new HashMap(); //used .equals() method to identify the keys content comparison
		m.put(i, 11);
		m.put(j, 11);		
		System.out.println(m);		
		
		IdentityHashMap<Integer,Integer> im = new IdentityHashMap<>(); //used == operator to identify the keys reference comparison
		im.put(i, 11);
		im.put(j, 11);		
		System.out.println(im);
		
		
		

	}

}
