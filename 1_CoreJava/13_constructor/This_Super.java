class A{
     public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        //super(); // calling the constructor of super class
        System.out.println("In B");
    }

     public B(int n){
        //super(n);
        this(); // calling constructor of B class
        System.out.println("In B int");
        
    }
}

public class This_Super {
    public static void main(String[] args) {
        //B obj = new B();
        B obj1 = new B(1);

        // every constructor by default has super() as its first expression
        // every class in java extends object class
    }
}
