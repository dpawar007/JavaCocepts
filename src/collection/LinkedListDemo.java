package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
 		
       //LinkedList l1 = new LinkedList(Collection c);
		
		LinkedList l = new LinkedList();
		l.add("Durga");
		l.add(30);
		l.add(null);
		l.add("Durga");
		
		System.out.println(l);
		
		l.set(0, "Software");
		l.add(0,"Venky");
		
		System.out.println(l);
		
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l); //[CCC, Venky, Software, 30, null]
	}

}
