package jdk8.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String hero;
	String heroine;

	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

}

public class DisplayMovieInformation {
	public static void main(String[] args) {
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		populate(moviesList);
		Consumer<Movie> consumer = m -> {
			System.out.println("Movie name : " + m.name);
			System.out.println("Movie hero : " + m.hero);
			System.out.println("Movie heroin : " + m.heroine);
		};

		for (Movie m : moviesList) {
			consumer.accept(m);
			System.out.println();
		}
	}

	private static void populate(ArrayList<Movie> moviesList) {
		moviesList.add(new Movie("bahubali", "prabhas", "anushka"));
		moviesList.add(new Movie("rayees", "shahrukh", "katrinan"));
		moviesList.add(new Movie("kite", "hritik", "kagna"));
		moviesList.add(new Movie("dhoom", "john", "bipasha"));
	}

}
