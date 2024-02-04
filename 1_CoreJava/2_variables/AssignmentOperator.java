

public class AssignmentOperator {
    public static void main(String[] args) {
        int num1 = 7;
        int num2= 5;

        // int result = num1* num2; //35
        // int result = num1- num2; //2
        // int result = num1+ num2; //12
        // int result = num1/ num2;// 1
        int result = num1% num2; // 2
        System.out.println(result);
        num1+=2;
        num1++; //post increment
        --num1; //pre decrement  
    }
}
