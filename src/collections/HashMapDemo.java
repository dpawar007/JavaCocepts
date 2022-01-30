package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	//LinkedHashMap m = new LinkedHashMap();
		HashMap m = new HashMap();
		// Creates an Empty HashMap Object with Default Initial Capacity 16 and Default
		// Fill Ratio 0.75
		HashMap m1 = new HashMap(12);
		// HashMap m2 = new HashMap(intinitialcapacity, float fillRatio);
		// HashMap m = new HashMap(Map m);
		m.put("Chiru", 700);
		m.put("Bala", 800);
		m.put("Venki", 200);
		m.put("Nag", 500);

		System.out.println("first HASH Map");
		System.out.println(m);
	
		System.out.println(m.put("Chiru", 1000));
	
		System.out.println("first HASH Map After Adding Element");
		System.out.println(m);

		Set s = m.keySet();
		System.out.println("Using Set get KeySet");
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println("Using Collection get Values");
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println("Using Set get entrySet");
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m4 = (Map.Entry) itr.next();
			System.out.println(m4.getKey() + "....." + m4.getValue());
			if (m4.getKey().equals("Nag")) {
				m4.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
