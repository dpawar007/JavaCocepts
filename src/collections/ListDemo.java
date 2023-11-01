package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	static List<String> arraylist;
	static List<String> linkedlist;
	static List<String> stack;
	static List<String> vector;
	
	public static void main(String[] args) {
		arraylist = new ArrayList<>();
		arraylist.add("Dipak");
		linkedlist = new LinkedList<>();
		linkedlist.add("Dipak");
		stack =  new Stack<>();
		stack.add("Dipak");		
		vector = new Vector<>();
		vector.add("Dipak");
		
		System.out.println("arraylist "+arraylist);
		System.out.println("linkedlist "+linkedlist);
		System.out.println("stack "+stack);
		System.out.println("queue "+vector);
	}

}
