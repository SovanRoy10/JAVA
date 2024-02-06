public class Strings {
    public static void main(String[] args) {
    	//String is not a primitive data type , String is class

        String name1 = new String("Sovan"); // Creating  string using the default constructor
        System.out.println(name1); // Printing the string
        
        System.out.println("Hello "+ name1);
        System.out.println(name1.charAt(0)); // character at index 0
        
        
        String name = "SOVAN"; // Initializing a string literal
        
        name = name + " ROY";
        System.out.println(name);
        
    }
}
