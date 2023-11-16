package jdk8.functionalinterfaces.predicates;

import java.util.function.Predicate;

//Default methods in predicate
//negate()
//and()
//or()


//Static method
//isEqual(Object targetRef)

public class PredicateJoiningDemo {
	public static void main(String[] args) { 
			int[] i = {0,5,10,15,20,25,30,35,40};
			Predicate<Integer> p1 = I -> I>10;
			Predicate<Integer> p2 = I -> I%2==0;
			System.out.println("The number greater than 10 are: ");
			m(p1,i);
			System.out.println("The even numbers are: ");
			m(p2,i);
			System.out.println("The numbers not greater than 10 are : ");
			m(p1.negate(),i);
			System.out.println("The numbers greater than 10 and even number are: ");
			m(p1.and(p2),i);
			System.out.println("The number greater than 10 or even numbers are : ");
			m(p1.or(p2),i);					
			
			Predicate<String> p = Predicate.isEqual("dipak");
			System.out.println(p.test("DurgaSoft"));
			System.out.println(p.test("dipak"));
	}
	
  public static void m(Predicate<Integer> predicate, int[] x) {
	  for(int x1: x) {
		  if(predicate.test(x1)) {
			  System.out.println(x1);
		  }
	  }
  }
}
