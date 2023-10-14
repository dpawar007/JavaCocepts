package garbagecollections;

class Gctest{
	
}

public class GarbageCollectionDemo {

	public static void main(String[] args) {
			Runtime r=Runtime.getRuntime();
			Gctest gctest = new Gctest();
			System.out.println(gctest);
			System.out.println("Before GC run :"+r.freeMemory());
			gctest = null;			 
			r.gc();
			System.out.println(gctest);			
			System.out.println("After GC run :"+r.freeMemory());	
	}

}
