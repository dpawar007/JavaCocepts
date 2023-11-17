package jdk8.functionalinterfaces.primitivetype;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorsPrimitiveVersions {

	public static void main(String[] args) {
		UnaryOperator<Integer> o = i -> i * i;
		System.out.println(o.apply(10));

		IntUnaryOperator io = i -> i * i;
		System.out.println(io.applyAsInt(10));

		LongUnaryOperator lo = i -> i * i;
		System.out.println(lo.applyAsLong(10));

		DoubleUnaryOperator dp = i -> i * i;
		System.out.println(dp.applyAsDouble(10.0));
	}

}
