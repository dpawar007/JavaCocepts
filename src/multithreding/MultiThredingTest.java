package multithreding;

class ThreadTest extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Creating Thread By Extending Thread Class in Run Method ");
	}

}

class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Creating Thread By Impelmenting Runnable Interface");
	}

}

public class MultiThredingTest {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		    //test.start(); //New Thread will be created		    
		   //test.run(); // It's Run like normal method

		ThreadTest2 test2 =new ThreadTest2();
		//test2.run();		
		Thread thread = new Thread(test2);
		thread.setName("dipka_new_thread");
		thread.start();
			 
		System.out.println("New Created Thread Name :=====> "+thread.getName());
		System.out.println("Main Thread Name :======> "+Thread.currentThread().getName());
		
		System.out.println("========----Thread Priorirty---===========");
		System.out.println("New Created Thread Priorirty :=====> "+thread.getPriority());
		System.out.println("Main Thread Priorirty :======> "+Thread.currentThread().getPriority());
		
		System.out.println("============----After SettingPriority-================");
		System.out.println("MIN : "+ Thread.MIN_PRIORITY);
		System.out.println("NORMAL : "+ Thread.NORM_PRIORITY);
		System.out.println("MAX : "+ Thread.MAX_PRIORITY);
		thread.setPriority(Thread.MIN_PRIORITY);
		System.out.println("New Created Thread after Set Priorirty  :=====> "+thread.getPriority());
		
		
		for (int i = 0; i < 5; i++) { 
			System.out.println("main thread");
		}
	}

}
