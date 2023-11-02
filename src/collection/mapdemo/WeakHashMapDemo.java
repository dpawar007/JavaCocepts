package collection.mapdemo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		HashMap<Object, String> m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);
		
		 System.out.println("=============--WeakHashMap--===============");
		
		WeakHashMap<Object, String> wm = new WeakHashMap<>();
		Temp t1 = new Temp();
		wm.put(t1, "Naresh");
		System.out.println(wm);
		t1 = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(wm);
	}
}

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize() Called");
	}

}