
public class CalculatorMain {
    public static void main(String[] args) {
        int num1 =4;
        int num2 =5;

        Calculator cal = new Calculator();
        int result = cal.add(num1,num2);
        result = cal.multiply(num1,num2);

        System.out.println(result);
    }
}
