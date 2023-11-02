package concurent.collectiondemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	  //CopyOnWriteArrayList l = new CopyOnWriteArrayList(Collection c);
	  //CopyOnWriteArrayList l = new CopyOnWriteArrayList(Object[] a);
		l.add("A");
		l.add("A");
		l.addIfAbsent("B");
		l.addIfAbsent("B"); //The Element will be Added if and Only if List doesn’t contain this Element
		System.out.println(l); //[A, A, B]
		
		System.out.println();
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.add("A");
		l1.add("C");
		System.out.println(l1); //[A, C]
		l1.addAll(al);
		System.out.println(l1); //[A, C, A, B]
		
		ArrayList l2 = new ArrayList();
		l2.add("A");
		l2.add("D");
		l1.addAllAbsent(l2);
		System.out.println(l1); //[A, C, A, B, D]
	}

}
