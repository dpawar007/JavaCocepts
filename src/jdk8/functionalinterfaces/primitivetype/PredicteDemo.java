package jdk8.functionalinterfaces.primitivetype;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicteDemo {

	public static void main(String[] args) {
		int[] a = { 0, 5, 10, 15, 20, 25, 30, 35 };
		IntPredicate ii = (v) -> v % 2 == 0;
		for (int x : a) {
			if (ii.test(x))
				System.out.println(x);
		}

		long[] b = { 0, 5, 10, 15, 20, 25, 30, 35 };
		LongPredicate li = (v) -> v % 2 == 0;
		for (long x : b) {
			if (li.test(x))
				System.out.println(x);
		}

		double[] c = { 0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0 };
		DoublePredicate di = (v) -> v % 2 == 0;
		for (double x : a) {
			if (di.test(x))
				System.out.println(x);
		}

	}
}
