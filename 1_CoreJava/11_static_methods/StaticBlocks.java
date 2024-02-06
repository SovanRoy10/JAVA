

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
	
}

public class StaticBlocks {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "phone";
		
		Mobile obj2 = new Mobile();
		
		obj1.show();
		
		//static block is getting called at first
		
		// every time we create any objects:
		// 1. class loads and 2. objects are instantiated  
		// but the class loads only once. 
		// so for the first object the class is loaded first , then it will call the static blocks , after that the object is instantiated so the constructor is called. 
		// this is why the the static blocks is getting called first , and irrespective how many objects are created the class is loaded for only once, so the static block is getting called for only one time
		
	}

}
