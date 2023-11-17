package jdk8.functionalinterfaces.primitivetype;

import java.util.function.DoublePredicate;

public class DoublePredicteDemo {

	public static void main(String[] args) {
		double[] a = { 0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0 };
		DoublePredicate i = (v) -> v % 2 == 0;
		for (double x : a) {
			if (i.test(x))
				System.out.println(x);
		}
	}
}
