package multithreding;

class MyThread5 extends Thread {
	MyThread5(ThreadGroup g, String name) {
		super(g, name);
	}

	public void run() {
		System.out.println("Child Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println(pg.getParent().getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");		 
		System.out.println(cg.getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1, "Thread 1");
		Thread t2 = new Thread(g1, "Thread 2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "Thread 3");
		System.out.println(t1.getPriority());// 5
		System.out.println(t2.getPriority());// 5
		System.out.println(t3.getPriority());// 3
		
		System.out.println();
		
		ThreadGroup pg1 = new ThreadGroup("Parent Group");
		ThreadGroup cg1 = new ThreadGroup(pg1, "Child Group");
		MyThread5 t7 = new MyThread5(pg1, "Child Thread 1");
		MyThread5 t8 = new MyThread5(pg1, "Child Thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
		
	}

}
