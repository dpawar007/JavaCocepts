package multithreding;

class Prevent extends Thread  {
	public void run() {
		for (int i = 0; i < 5; i++) {			 
		//	Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println( "child thread");
			try {
				Thread.sleep(2000);
			 }catch(InterruptedException e) {}
		}
	}
}

public class PreventThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Prevent t = new Prevent();
		t.start();	  
      // t.join(1000);
		for (int i = 0; i < 5; i++) {			
			System.out.println("main thread");
		}

	}

}
