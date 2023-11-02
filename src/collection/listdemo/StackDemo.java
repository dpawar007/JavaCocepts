package collection.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		System.out.println("===============----Methods Used for Stacks---=================");
		stack.push("Dipak");
		stack.push("Vinod");
		stack.push("Kiran");
		stack.push("Vijay");
		System.out.println("After Adding the element in the stack => "+stack);
		stack.pop();
		System.out.println("After pop() the element in the stack => "+stack);
		System.out.println("Return the top of the stack without removal => "+stack.peek());
		System.out.println("Return the true of stack is empty => "+stack.empty());
		System.out.println("Returns Offset if the Element is Available Otherwise Returns -1 => "+stack.search("Vijay"));		

	}

}
