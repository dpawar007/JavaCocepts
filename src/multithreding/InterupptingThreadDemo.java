package multithreding;

class Interuppt extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("i am lazy Thread :" + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
	}
}

public class InterupptingThreadDemo {

	public static void main(String[] args) {
		Interuppt t = new Interuppt();
		t.start();
		t.interrupt();  
		System.out.println("end of main thread");

	}

}
