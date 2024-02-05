class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, int b) { // method overloading(same no of arguments but different type)
        return a + b;
    }

    public int add(int a, int b, int c) { // method overloading(same type of arguments but no of arguments is different)
        return a + b + c;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int multiply(int a, int b, int c) { // method overloading
        return a * b * c;
    }

}


public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 3, 5));
        System.out.println(cal.add(2, 3));

        // for method overloading return type doesnot matter.
        // 1. method name should be same 
        // 2. type of arguments can be different
        // 3. no of arguments can be different

    }
}