package oops;

public class GarbageCollectorTest {
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Objects are GC Collected ");
		int a=10/0;
		
	}
	void m1()
	{
		GarbageCollectorTest t1=new GarbageCollectorTest();
		GarbageCollectorTest t2=new GarbageCollectorTest();
	}
	public static void main(String[] args) throws Throwable
	{
		GarbageCollectorTest t=new GarbageCollectorTest();
		t.m1();
	//t.finalize();
		System.gc();
	}
}
