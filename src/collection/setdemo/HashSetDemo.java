package collection.setdemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
			HashSet<Integer> hashSet = new HashSet<>(); //Created Empty Hashset object with default initial capacity of 16 Default Fill Ratio 0.75
			HashSet<Integer> hashSet2 = new HashSet<>(15,50);
			for(int i=0;i<=12;i++)
				 hashSet.add(i);
						
			System.out.println(hashSet);
			System.out.println(hashSet.add(8));
			System.out.println(hashSet.size());		

	}

}
