package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Dipak");
		queue.add("Tau");
		queue.add("Bhaiya");
		queue.add("Bhaiya");
		queue.add("Durva");

		System.out.println(queue);
	}

}
