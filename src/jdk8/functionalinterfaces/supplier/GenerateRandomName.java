package jdk8.functionalinterfaces.supplier;

import java.util.function.Supplier;

public class GenerateRandomName {

	public static void main(String[] args) {
		Supplier<String> name = () -> {
			String[] s1 = { "sunny", "bunny", "hunny", "vinny" };
			int x = (int) (Math.random() * 4); // 0 to 3
			return s1[x];
		};
		System.out.println(name.get());
	}
}
