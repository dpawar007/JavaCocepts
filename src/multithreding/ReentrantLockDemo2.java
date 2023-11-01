package multithreding;

import java.util.concurrent.locks.ReentrantLock;

class Display1 {
	ReentrantLock l = new ReentrantLock(true);

	public void wish(String name) {
		l.lock(); // ->1
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("After l.isLocked() : " + l.isLocked());
		System.out.println("After Lock l.getHoldCount() : " + l.getHoldCount());
		System.out.println("After Lock l.isHeldByCurrentThread() : " + l.isHeldByCurrentThread());
		System.out.println("After Lock l.getQueueLength() : " + l.getQueueLength());
		System.out.println("After Lock l.hasQueuedThreads() : " + l.hasQueuedThreads());

		for (int i = 0; i < 5; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
		l.unlock(); // ->2
		System.out.println("Before Unlock l.isLocked() : " + l.isLocked());
		System.out.println("Before Lock l.getHoldCount() : " + l.getHoldCount());
		System.out.println("Before Lock l.isHeldByCurrentThread() : " + l.isHeldByCurrentThread());
		System.out.println("Before Lock l.getQueueLength() : " + l.getQueueLength());
		System.out.println("Before Lock l.hasQueuedThreads() : " + l.hasQueuedThreads());
	}
}

class MyThread extends Thread {
	Display1 d;
	String name;

	MyThread(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ReentrantLockDemo2 {

	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuva Raj");
		MyThread t3 = new MyThread(d, "ViratKohli");
		t1.start();
		t2.start();
		t3.start();
		t2.setPriority(10);
		t3.setPriority(10);
		t1.setPriority(10);
	}

}
