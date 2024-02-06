public class StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // StringBuffer will give you a buffer size of 16 bytes
        System.out.println(sb.capacity()); // 16

        StringBuffer sb1 = new StringBuffer("Sovan");
        System.out.println(sb1.capacity()); // 21 // it stores my name and gives 16 space extra 

        System.out.println(sb1.length()); // 5 , giving the length of StringBuffer

        // StringBuffer is mutable

        sb1.append(" Roy");
        System.out.println(sb1);

        String str = sb1.toString(); // string buffer to string
        System.out.println(str);


        // for deleting character at index 2
        sb1.deleteCharAt(2);
        System.out.println(sb1); // Soan Roy

        // insert 
        sb1.insert(0, "Yoyo ");
        System.out.println(sb1); //  Yoyo Soan Roy

        //substring
        System.out.println(sb1.substring(1, 4));

    }
}