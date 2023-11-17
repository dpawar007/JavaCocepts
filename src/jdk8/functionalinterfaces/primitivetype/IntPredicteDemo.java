package jdk8.functionalinterfaces.primitivetype;

import java.util.function.IntPredicate;

public class IntPredicteDemo {

	public static void main(String[] args) {
		int[] a = { 0, 5, 10, 15, 20, 25, 30, 35 };
		IntPredicate i = (v) -> v % 2 == 0;
		for (int x : a) {
			if(i.test(x))
			System.out.println(x);
		}
	}
}
