package collections;

import java.util.HashMap;

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize() Called");
	}
}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
	//WeakHashMap m = new WeakHashMap();
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(500);
		System.out.println(m);
	}

}
