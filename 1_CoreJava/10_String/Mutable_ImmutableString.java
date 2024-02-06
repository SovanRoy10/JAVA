public class Mutable_ImmutableString {
    public static void main(String[] args) {
       String s1 = "Sovan";
       String s2 = "Sovan";

       System.out.println(s1==s2); // true

       // by default string are immutable 

       // but what is we want mutable strings , thats why we have 2 different classes , String buffer and String builder.

    }
}
