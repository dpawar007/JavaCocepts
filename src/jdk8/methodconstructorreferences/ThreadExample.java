package jdk8.methodconstructorreferences;

public class ThreadExample {

	public void m() {
		for (int a = 0; a < 10; a++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		ThreadExample t =new ThreadExample();
		Runnable r = t::m;
		Thread t1 =  new Thread(r);
		t1.start();
		for (int a = 0; a < 10; a++) {
			System.out.println("Main thread");
		}
	}
}
