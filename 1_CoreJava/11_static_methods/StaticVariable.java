

class Mobile{
	// these are instance variables 
	
	String brand; 
	int price;
	String network;
	static String name; // static variables
	
	public void show() 
	{
		System.out.println(brand + " : "+ price + " : "+ name);
	}
	
}

public class StaticVariable {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		obj1.name = "smartPhone";
		obj1.network = "jio";
		
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1200;
		obj2.name = "smartPhone";
		obj2.network = "jio";
		
		obj1.name="phone"; // static variable is common for all the objects 
		Mobile.name="phone"; // correct way to call static variables 
		
		//by changing static variable for one object , it will affect for all the objects
		// static variable belongs to the class not the object , that's why we can call static variables with className
		
		// we can call static methods without creating any object
		
		
		obj1.show();
		obj2.show();
	}

}
