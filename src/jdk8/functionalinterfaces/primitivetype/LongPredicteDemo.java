package jdk8.functionalinterfaces.primitivetype;

import java.util.function.LongPredicate;

public class LongPredicteDemo {

	public static void main(String[] args) {
		long[] a = { 0, 5, 10, 15, 20, 25, 30, 35 };
		LongPredicate i = (v) -> v % 2 == 0;
		for (long x : a) {
			if(i.test(x))
			System.out.println(x);
		}
	}
}
