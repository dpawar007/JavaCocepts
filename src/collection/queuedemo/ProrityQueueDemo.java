package collection.queuedemo;

import java.util.PriorityQueue;

public class ProrityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); //Initial capacity of 11
		System.out.println(priorityQueue.peek()); //null
	//	System.out.println(priorityQueue.element()); // java.util.NoSuchElementException
		for(int i=0; i<=10; i++) {
			priorityQueue.offer(i);
		}
		System.out.println(priorityQueue); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(priorityQueue.poll()); //0
		System.out.println(priorityQueue); //[1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
		

	}

}
