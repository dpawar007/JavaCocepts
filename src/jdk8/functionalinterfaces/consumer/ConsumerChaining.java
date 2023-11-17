package jdk8.functionalinterfaces.consumer;

import java.util.function.Consumer;

//Default methods
//andThen()
public class ConsumerChaining {
	public static void main(String[] args) {
		Consumer<Movie1> consumer1 = m -> System.out.println("Movie : " + m.name + " Is ready to release");
		Consumer<Movie1> consumer2 = m -> System.out
				.println("Movie : " + m.name + " Is just release & it is " + m.result);
		Consumer<Movie1> consumer3 = m -> System.out.println("Movie : " + m.name + " Information stored in the db");
		Consumer<Movie1> chainConsumer = consumer1.andThen(consumer2).andThen(consumer3);
		Movie1 m1 = new Movie1("bahubali", "hit");
		chainConsumer.accept(m1);
		Movie1 m2 = new Movie1("spiderman", "flop");
		chainConsumer.accept(m1);
	}
}

class Movie1 {
	String name;
	String result;

	public Movie1(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
}
