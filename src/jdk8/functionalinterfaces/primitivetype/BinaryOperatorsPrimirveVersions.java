package jdk8.functionalinterfaces.primitivetype;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorsPrimirveVersions {

	public static void main(String[] args) {
		BiFunction<String, String, String> bfun = (s1, s2) -> s1.concat(s2);
		System.out.println(bfun.apply("durga", "soft"));

		BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
		System.out.println(bo.apply("dipak", "pawar"));

		// Primitive Type of Binary Operator

		IntBinaryOperator ibo = (i1, i2) -> i1 + i2;
		System.out.println(ibo.applyAsInt(5, 5));

		LongBinaryOperator lbo = (i1, i2) -> i1 + i2;
		System.out.println(lbo.applyAsLong(5, 5));

		DoubleBinaryOperator dbo = (i1, i2) -> i1 + i2;
		System.out.println(dbo.applyAsDouble(5, 5));

	}
}
