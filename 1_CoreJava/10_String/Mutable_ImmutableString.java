public class Mutable_ImmutableString{
    public static void main(String[] args) {
       String s1 = "Sovan";
       String s2 = "Sovan";

       System.out.println(s1==s2);

       // by default Strings are immutable 
       // to use strings as mutable we have 2 different classes : 1. String buffer and String builder
    }
}