package oops;

//Textual Representation how an object will look like in the memory
//Whatever we write in class is in actual the property of object as we are describing object
//if you want anything which should belong to class make it static !!

class Product {
	// Attributes
 //private int pid;
	int pid;
	String name;
	int price;

	// Constructor
	public Product() {
		System.out.println("Product Object Constructed");
	}

	// Methods (behaviour)
	// to Write data in product object we have this Method

	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		System.out.println("Data Written in Product Object");
	}

	// To read data from Product Object
	void showProductDetails() {
		System.out.println("-------Product ID :" + pid + "----------------");
		System.out.println("Name :\t" + name);
		System.out.println("Price :\t" + price);
		System.out.println("-------------------------------------------");

	}

	// Setter
	void setPid(int pid) {
		this.pid = pid; // this means ref to current object\
		// LHS belongs to Object and RHS belongs to method.
	}

	// Getter
	int getPid() {
		return pid;
	}
}

class Mobile extends Product { // IS-A Relationship, Mobile IS-A Product, Mobile is Child, Product is Parent

	String os;
	int ram;
	int sdCardSize;

	public Mobile() {
		System.out.println(">> Mobile Object Constructed ");
	}

	// We have redefined the same methods from the parent into the child with
	// different inputs
	// We have now 2 methods in the child, 1 from Parent and 1 of Child
	// Both are different as in based on inputs (even through name is same)
	// Method OverLoading :- Same Method Name with different Inputs
	void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		System.out.println("Data Written in Product Object");
	}

	// Lets ReDefined showProductDetails as well
	// But There we have same inputs
	// 2 Methods, 1 from parent 1 in child and we have same signatures !!
	// child Method will be executed and not the parent method

	// Method Overriding : Same method Name with Same Inputs in Parent Child
	// Relationship.
	void showProductDetails() {
		System.out.println("-------Product ID :" + pid + "----------------");
		System.out.println("Name :\t" + name);
		System.out.println("Price :\t" + price);
		System.out.println("OS :\t" + os);
		System.out.println("RAM :\t" + ram);
		System.out.println("SDCard :\t" + sdCardSize);
		System.out.println("-------------------------------------------");

	}
}

public class AllOOPsConcepts {

	// main is executed by JVM when program will run
	public static void main(String[] args) {

		/*
		 * //Create an Object : Product Product product = new Product(); //product is
		 * not an object its a reference variable which holds the hashCode of the Object
		 * in hexadecimal notation System.out.println("product is : "+product); //we get
		 * 7851e922 as a hashCode, so product is a ref var not an object
		 * 
		 * //Writing data in object product.setProductDetails(101, "iPhoneX", 70000);
		 * 
		 * //Reading data from Object product.showProductDetails();
		 * 
		 * System.out.println();
		 * 
		 * //Lets Write the data directly Product product2 = new Product();
		 * //product2.pid=201; error now since attribute marked as private cannot be
		 * accessed !! product2.setPid(201); product2.name="Nike Shoes";
		 * product2.price=5000; product2.showProductDetails();
		 * 
		 */

		// Requesting to get Mobile Object Constructed
		Mobile mobile = new Mobile();
		// Product Object gets Constructed before the Mobile Object !! --> Rule to
		// Inheritance (Object to Object)

		// mobile.setProductDetails(301, "iphoneX", 7000);
		// mobile.showProductDetails();

		mobile.setProductDetails(301, "IphoneX", 70000, "IOS", 4, 128);
		mobile.showProductDetails();

	}

}
