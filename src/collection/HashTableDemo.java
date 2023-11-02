package collection;

import java.util.Hashtable;

class TempR{
	int i;
	public TempR(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
}
public class HashTableDemo {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
 
		Hashtable h = new Hashtable();
		//Creates an Empty Hashtable Object with Default Initial Capacity 11 and Default Fill Ratio 0.75
		
	   //Hashtable h1 = new Hashtable(13);
	  //Hashtable h2 = new Hashtable(intinitialcapacity, float fillRatio);
      //Hashtable h3 = new Hashtable(Map m);
 		
		h.put(new TempR(5), "A");
		h.put(new TempR(2), "B");
		h.put(new TempR(6), "C");
		h.put(new TempR(15), "D");
		h.put(new TempR(23), "E");
		h.put(new TempR(16), "F");
	//h.put("Durga",null); //RE: java.lang.NullPointerException
		System.out.println(h); //{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
	}

}
