package jdk8.functionalinterfaces.primitivetype;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class SupplierDemo {

	public static void main(String[] args) {
		IntSupplier is = () -> (int) Math.random() * 10;
		System.out.println(is.getAsInt());

		LongSupplier ls = () -> (int) Math.random() * 10;
		System.out.println(ls.getAsLong());

		DoubleSupplier ds = () -> (int) Math.random() * 10;
		System.out.println(ds.getAsDouble());

		BooleanSupplier bs = () -> true;
		System.out.println(bs.getAsBoolean());

	}
}
