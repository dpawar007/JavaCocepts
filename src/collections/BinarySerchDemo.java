package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator5 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		return I2.compareTo(I1);
	}
}
public class BinarySerchDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al); //[Z, A, M, K, a]
		Collections.sort(al);
		System.out.println(al); //[A, K, M, Z, a]
		System.out.println(Collections.binarySearch(al, "Z")); //3
		System.out.println(Collections.binarySearch(al, "J")); //-2
		
		System.out.println();
		
		System.out.println(al); //[15, 0, 20, 10, 5]
		Collections.sort(al, new MyComparator5());
		System.out.println(al); //[20, 15, 10, 5, 0]
		System.out.println(Collections.binarySearch(al, 10, new MyComparator5())); //2
		System.out.println(Collections.binarySearch(al, 13, new MyComparator5())); //-3
		System.out.println(Collections.binarySearch(al, 17)); //-6
	}

}
