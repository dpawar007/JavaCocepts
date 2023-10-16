package multithreding;

class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
	public void disp() {
		System.out.println("Hello : "+Thread.currentThread().getName());
	}
}

class MyThread2 extends Thread {
	Display d;
	String name;

	MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);		 
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread2 t1 = new MyThread2(d1, "dhoni");
		MyThread2 t2 = new MyThread2(d1, "yuvaraj");
		t1.start();
		t2.start();
	}

}
