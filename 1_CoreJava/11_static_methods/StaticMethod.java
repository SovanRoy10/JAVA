class Mobile{
	
	String brand; 
	int price;
	static String name; // static variable 
	
	//static blocks
	// static block calling happens only once.
	static {
		name = "Phone";
		System.out.println("In static block");
	}
	
	public Mobile()
	{
		brand = "";
		price = 200;
		System.out.println("In constructor");
	}
	
	public void show() 
	{
		System.out.println(brand + " : "+ price + " : "+ name);
	}
	
	public static void display() { // static method
		System.out.println("In static method");
		
		//we cannot use non static variables inside static method
		// System.out.println(brand + " : "+ price + " : "+ name);
		
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "phone";
		
		Mobile obj2 = new Mobile();
		
		Mobile.display();
		
	}

}
