package collection;

import java.util.HashSet;

public class HashSetDemo {

	public HashSetDemo() {		
	}
	public static void main(String[] args) {

		HashSet h = new HashSet(); //Default Capacity is 16 Default Fill Ratio is 0.75
		HashSet h1 = new HashSet(13);
	  //HashSet h2 = new HashSet(intinitialCapacity, float fillRatio);
      //HashSet h = new HashSet(Collection c);
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false
		System.out.println(h);

	}

}
