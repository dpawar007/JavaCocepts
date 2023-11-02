package collection.mapdemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<>();// initial capacity of 11
		Hashtable h = new Hashtable();
		h.put(new Hash(5), "A");
		h.put(new Hash(2), "B");
		h.put(new Hash(6), "C");
		h.put(new Hash(15), "D");
		h.put(new Hash(23), "E");
		h.put(new Hash(16), "F");
		//h.put("Durga", null); // RE: java.lang.NullPointerException
		System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}

	}

}

class Hash {
	int i;

	public Hash(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i + "";
	}
}
