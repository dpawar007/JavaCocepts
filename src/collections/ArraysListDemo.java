package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArraysListDemo {

	public static void main(String[] args) {
		 	
	  //ArrayList<String> l = new ArrayList<>(); //Generics
	  //ArrayList<String> l = new ArrayList<String>();  ////Generics
		ArrayList l = new ArrayList<>();
		ArrayList l1 = new ArrayList(17);
		ArrayList l2 = new ArrayList();
		//ArrayList l = new ArrayList(Collection c);
		//Creates an EqualentArrayList Object for the given Collection Object.
		//This Constructor Meant for Inter Conversion between Collection Objects
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l); //[A, 10, A, null]
		
		l.remove(2);
		System.out.println(l); //[A, 10, null]
		l.add(2,"M");
		l.add("N");
		System.out.println(l); //[A, 10, M, null, N]
		
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		System.out.println(al instanceof Serializable); //true
		System.out.println(ll instanceof Cloneable); //true
		System.out.println(al instanceof RandomAccess); //true
		System.out.println(ll instanceof RandomAccess); //false
		
		ArrayList al1 = new ArrayList ();
		List l3 = Collections.synchronizedList(al1);
	}

}
