package multithreding;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.start();		 
		synchronized (a) {
			System.out.println("main Thread calling wait() method");// step-1
			System.out.println("THIS HASHCODE : "+a.hashCode());
			a.wait();
			System.out.println("main Thread got notification call");// step-4
			System.out.println(a.total);
		}
	}
}

class ThreadA extends Thread {
	int total = 0;	 
	public void run() {
		synchronized (this) {
			System.out.println("THIS HASHCODE : "+this.hashCode());
			System.out.println("child thread starts calcuation");// step-2
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call");// step-3
			this.notify();
		}
	}
}
