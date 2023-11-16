package jdk8.functionalinterfaces.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CheckTheStringLength {

	public static void main(String[] args) {
		Predicate<String> predicate =  s -> s.length()>5;
		System.out.println(predicate.test("Dipak"));
		System.out.println(predicate.test("Chamana"));
		
		Predicate<Collection> pc =  c -> c.isEmpty();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dipak");
		System.out.println("ArrayList Non-empty: "+pc.test(arrayList));
		ArrayList<String> arrayList1 = new ArrayList<String>();
		System.out.println("Empty ArrayList : "+pc.test(arrayList1));
	}
}
