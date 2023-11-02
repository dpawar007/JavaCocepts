package collection.setdemo;

import java.util.TreeSet;

public class NevigableSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1000);
		set.add(2000);
		set.add(3000);
		set.add(4000);
		set.add(5000);
		System.out.println(set);  //		[1000, 2000, 3000, 4000, 5000]
		System.out.println(set.ceiling(2000)); //2000
		System.out.println(set.higher(2000));  //3000
		System.out.println(set.floor(3000));  //3000
		System.out.println(set.lower(3000)); //2000
		System.out.println(set.pollFirst());  //1000
		System.out.println(set.pollLast());  //5000
		System.out.println(set.descendingSet());  //[4000, 3000, 2000]
		System.out.println(set);  //[2000, 3000, 4000]
 	}

}
