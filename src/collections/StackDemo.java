package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("B");
		System.out.println(s); //[A, B, C]
		System.out.println(s.search("A")); //4
		System.out.println(s.search("C")); //3
		System.out.println(s.search("B")); //1
		System.out.println(s.search("Z")); //-1
	}
}
