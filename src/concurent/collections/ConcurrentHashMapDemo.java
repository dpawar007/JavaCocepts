package concurent.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		/*If the Key is Already Present then Entry won’t
		be added and Returns Old associated Value. If
		the Key is Not Available then Only Entry will
		be added*/
		ConcurrentHashMap m = new ConcurrentHashMap();
		ConcurrentHashMap m1 = new ConcurrentHashMap(17);
 	  //ConcurrentHashMap m2 = new ConcurrentHashMap(intinitialCapacity, float fillRatio);
	  //ConcurrentHashMap m3 = new ConcurrentHashMap(intinitialCapacity, float fillRatio,intconcurrencyLevel);
	  //ConcurrentHashMap m4 = new ConcurrentHashMap(Map m);
		
		m.put(101, "Durga");
		m.put(101, "Ravi");
		System.out.println(m); //{101=Ravi}
		m.putIfAbsent(101, "Siva");
		System.out.println(m); //{101=Ravi}
		
		
		System.out.println();
		
		m.put(101, "Durga");
		m.remove(101, "Ravi"); //Value Not Matched with Key So Nor Removed
		System.out.println(m); //{101=Durga}
		m.remove(101, "Durga");
		System.out.println(m); //{}
		
		System.out.println();
		
		m.put(101, "Durga");
		m.replace(101, "Ravi", "Siva");
		System.out.println(m); //{101=Durga}
		m.replace(101, "Durga", "Ravi");
		System.out.println(m); //{101=Ravi}
	}

}
