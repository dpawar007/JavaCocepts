package collections;

import java.util.Arrays;
import java.util.Comparator;

class MyComparator6 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
public class ArraysDemo {

	public static void main(String[] args) {
		int[] a = {10, 5, 20, 11, 6};
		System.out.println("Primitive Array Before Sorting:");
		for (int a1 : a) {
		System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive Array After Sorting:");
		for (int a1 : a) {
		System.out.println(a1);
		
		String[] s = {"A", "Z", "B"};
		System.out.println("Object Array Before Sorting:");
		for (String s1 : s) {
		System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object Array After Sorting:");
		for (String s1 : s) {
			System.out.println(s1);
			}
		}
		
		int[] a1 = {10, 5, 20, 11, 6};
		Arrays.sort(a1); //Sort By Natural Order
		System.out.println(Arrays.binarySearch(a1, 6)); //1
		System.out.println(Arrays.binarySearch(a1, 14)); //-5
		String[] s = {"A", "Z", "B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z")); //2
		System.out.println(Arrays.binarySearch(s, "S")); //-3
		Arrays.sort(s, new MyComparator6());
		System.out.println(Arrays.binarySearch(s, "Z", new MyComparator6())); //0
		System.out.println(Arrays.binarySearch(s, "S", new MyComparator6())); //-2
		System.out.println(Arrays.binarySearch(s, "N")); //-4
	}

}
