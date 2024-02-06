

class Human{
	private int age;
	private String name;
	
	public Human() // non - Parameterized constructor
	{
		age = 18;
		name = "John";
	}
	public Human(int age , String name) // constructor overloading // Parameterized constructor

	{
		this.age = age;
		this.name = name;
	}
	
	public Human(String name) //  Parameterized constructor

	{
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		Human obj = new Human();
		Human obj1 = new Human(22,"Rahul");
		obj.setAge(21);
		obj.setName("Sovan");
		
		System.out.println(obj.getName());
		
	}
}
