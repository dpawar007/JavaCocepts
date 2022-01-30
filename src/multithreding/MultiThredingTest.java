package multithreding;

class ThreadTest extends Thread{
	
	/*@Override
	public synchronized void start() {
     //super.start();
		System.out.println("In Overrrides Start Method");
	}*/

	public static void dispaly() {
		for(int i = 0 ;i<5 ; i++) 
			System.out.println("Creating Thread By Extending Thread Class in Display Method ");
	 	}
	public static void dispaly1() {
		for(int i = 0 ;i<5 ; i++) 
			System.out.println("Creating Thread By Extending Thread Class in Display1 Method ");
	 	}
	@Override
	public void run() {
		dispaly();
		dispaly1();
	}
}
class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ;i<5 ; i++) 
		System.out.println("Creating Thread By Impelmenting Runnable Interface");
	}
	
}
public class MultiThredingTest  {

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest(); //Instantiation of a Thread
	    t.start(); //starting of a Thread
	   //t.start(); //we will get R.E saying: IllegalThreadStateException
	   //t.run(); //starting of a Thread
	   //Note:- We can get current executing Thread object reference by using Thread.currentThread() method.
	    
	    System.out.println("Current thread name by JVM : "+Thread.currentThread().getName());//main  
	    System.out.println(t.getName());//Thread-0
	    Thread.currentThread().setName("Dipak Thread");
	    System.out.println(Thread.currentThread().getName());//Dipak Thread
	    System.out.println("Current Thread Priority: "+Thread.currentThread().getPriority());
	    Thread.currentThread().setPriority(7);
	    System.out.println("Current Thread Priority After Changing : "+Thread.currentThread().getPriority());
	    t.setPriority(8);
	    System.out.println("Get t Thread Priority : "+t.getPriority());
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		
		ThreadTest2 t1 = new ThreadTest2();
		Thread t2 = new Thread(t1);
		t2.start();
	}

}
