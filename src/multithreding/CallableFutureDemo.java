package multithreding;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable {
	int num;

	MyCallable(int num) {
		this.num = num;
	}

	public Object call() throws Exception {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

public class CallableFutureDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		MyCallable[] jobs = { 
				new MyCallable(10), 
				new MyCallable(20), 
				new MyCallable(30), 
				new MyCallable(40),
				new MyCallable(50), 
				new MyCallable(60) 
				};

		ExecutorService service = Executors.newFixedThreadPool(3);// Our Choice
		for (MyCallable job : jobs) {			 
			service.submit(job);
		}

		service.shutdown();
	}

}
