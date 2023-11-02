package collections.listdemo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		List<String> limpl = new LinkedList();
		Deque<String> dqimpl = new LinkedList();
		Queue<String> qimpl = new LinkedList();
		
		System.out.println("================--LinkedList Specific Methods--========================");
		dqimpl.add("Dipak");
		dqimpl.add("Deepak");
		dqimpl.add("Vijay");
		dqimpl.add("Dipak");
		dqimpl.add("Kiran");
		System.out.println("Normal Add method List => "+dqimpl);
		dqimpl.addFirst("chaman");		
		dqimpl.addLast("raman");
		System.out.println("After addFirst() chaman And addLast() raman List => "+dqimpl);
		System.out.println("getFirst() => "+dqimpl.getFirst());
		System.out.println("getLast() => "+dqimpl.getLast());
		dqimpl.removeFirstOccurrence("Dipak"); 
		System.out.println("After removedFirstOccurence => "+dqimpl);
		dqimpl.removeFirst();
		dqimpl.removeLast();		
		System.out.println("After Removed First and Last Method => "+dqimpl);

	}

}
