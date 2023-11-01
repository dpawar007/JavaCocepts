package multithreding;

/*
NOTE:-
	If we comment line 1 then both main & child Threads are non-Daemon , and
hence both threads will be executed untill there completion.

	If we are not comment line 1 then main thread is non-Daemon and child thread
is Daemon. Hence when ever main Thread terminates automatically child thread
will be terminated.
*/

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("lazy thread");			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
public class DaemonThreadDemo {
	public static void main(String[] args) {
		{
			MyThread4 t=new MyThread4();
			t.setDaemon(true);//-->1
			t.start();
			Thread.currentThread().stop();
			System.out.println("isDeamon Check : "+t.isDaemon());
			System.out.println("end of main Thread");
			}
	}
}
