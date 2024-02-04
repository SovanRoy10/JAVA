

public class TypeCasting {
    public static void main(String[] args) {
        //narrowing
        byte b= 127;
        System.out.println(b); //127
        int a = 257;
        b = (byte) a; // casting
        System.out.println(b); // 257 % 256 = 1 , because the complete range is -128 to 128


        float f= 5.6f;
        int x = (int)f; // 5
        System.out.println(x);




        //type promotion (widening)
        byte num1 = 10;
        byte num2= 30;
        int result = num1 * num2; // promoting type
        System.out.println(result);

    }
}
