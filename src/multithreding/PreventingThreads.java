package multithreding;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread Thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class PreventingThreads {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.join();  // --->1		
		for (int i = 0; i < 5; i++) {
			System.out.println("main Thread");
		}
	}
	
}
