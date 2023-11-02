package collection.utilityclassesdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] integers = {2,3,4,8,5,9,10,1,13,12};
		Integer[] integers1 = {2,3,4,8,5,9,10,1,13,12};
		for(int i:integers) {
			System.out.print(i+" ");
		}
		System.out.println("================------Arrays.sort()-----===================");
		Arrays.sort(integers);
		for(int i:integers) {
			System.out.print(i+" ");
		}			
		System.out.println();
		Arrays.sort(integers1);
		for(int i:integers1) {
			System.out.print(i+" ");
		}		
		System.out.println();		
		Arrays.sort(integers1,new MyComparaterArraySort());
		for(int i:integers1) {
			System.out.print(i+" ");
		}
		
		System.out.println();		
		Integer[] integers2 = {2,3,4,8,5,9,10,1,13,12};		 
		List<Integer> arrayList = Arrays.asList(integers2);
		System.out.println(arrayList);		
		Arrays.sort(integers2);
		System.out.println(arrayList);
		
		
	}

}

class MyComparaterArraySort implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		Integer s1 = (Integer) o1;
		Integer s2 = (Integer) o2;
		return -s1.compareTo(s2);
	}

}