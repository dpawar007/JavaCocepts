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
		System.out.println("+++++++++++++++++++++---Creating the new thread groups---+++++++++++++++++++++++++++");
		
		System.out.println("Current Thread Group Name : "+Thread.currentThread().getThreadGroup().getName());
		System.out.println("Current Thread Group Parent Name : "+Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup pg = new ThreadGroup("Parent Group");
		System.out.println("Created Parent Thread Group : "+pg.getParent().getName());
		ThreadGroup cg = new ThreadGroup(pg, "Child Group");
		System.out.println("Created Child Group from Parent Thread Group : "+cg.getParent().getName());

		System.out.println("+++++++++++++++++++++---Checking the thread group priority---+++++++++++++++++++++++++++");
		
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1, "Thread 1");
		Thread t2 = new Thread(g1, "Thread 2");
		g1.setMaxPriority(3);
		System.out.println("g1.getMaxPriority() : "+g1.getMaxPriority());		 
		Thread t3 = new Thread(g1, "Thread 3");
		System.out.println("Thread Priority Before Adding to the Thread Group: "+t1.getPriority());// 5
		System.out.println("Thread Priority Before Adding to the Thread Group: "+t2.getPriority());// 5
		System.out.println("Thread Priority After Adding to the Thread Group: "+t3.getPriority());// 3
		g1.list();
 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

		ThreadGroup pg1 = new ThreadGroup("Parent Group");
		ThreadGroup cg1 = new ThreadGroup(pg1, "Child Group");
		MyThread5 t7 = new MyThread5(pg1, "Child Thread 1");
		MyThread5 t8 = new MyThread5(pg1, "Child Thread 2");
		t1.start();
		t2.start();
		System.out.println("Number of Active Threads Present in the ThreadGroup : "+pg1.activeCount());
		System.out.println("Number of Active ThreadGroups Present in the Current ThreadGroup : "+pg1.activeGroupCount());	 		
		pg1.list();  //Prints Information about ThreadGroup to the Console
		pg.destroy();
		System.out.println("To Destroy ThreadGroup and its SubThreadGroups : "+pg.activeGroupCount());
		   
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
      //Write a Program to Display All Thread Names belongs to System Group
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread T : t) {
			System.out.println(T.getName() + "-------" + T.isDaemon());
		}
	}

}
