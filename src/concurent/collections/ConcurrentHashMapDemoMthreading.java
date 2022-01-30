package concurent.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemoMthreading extends Thread {

  //static HashMap m = new HashMap(); // java.util.ConcurrentModificationException
    static ConcurrentHashMap m = new ConcurrentHashMap();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			}
			catch (InterruptedException e) {}
			System.out.println("Child Thread updating Map");
			m.put(103, "C");
	}
	
	public static void main(String[] args) throws InterruptedException {
		m.put(101, "A");
		m.put(102, "B");
		ConcurrentHashMapDemoMthreading t = new ConcurrentHashMapDemoMthreading();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer I1 = (Integer) itr.next();
			System.out.println("Main Thread iterating and Current Entry is:"+I1+"..............."+m.get(I1));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}

}
