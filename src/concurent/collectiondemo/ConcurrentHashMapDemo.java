package concurent.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) { 
//		ArrayList<String> al = new ArrayList<>();
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext()) {
//			String s = itr.next();	
//			System.out.println(s);
//			al.add("K");
//		}		
		
		ConcurrentHashMap cm = new ConcurrentHashMap();
		cm.put(101, "A");
		cm.put(102, "B");
		cm.putIfAbsent(103, "C");
		cm.putIfAbsent(101, "D");
		cm.remove(101, "D");
		cm.replace(102, "B", "E");
		System.out.println(cm); //{103=C, 102=E, 101=A}
		
	}

}

