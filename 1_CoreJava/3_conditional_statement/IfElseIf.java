
public class IfElseIf {
    public static void main(String[] args) {
        int x= 12;
        int y= 10;
        int z= 11;
        if(x>y && x>z){
            System.out.println(x+" is greatest");
        }
        else if(y>z){
            System.out.println(y+" is greatest");
        }
        else
        {
            System.out.println(z+" is greatest");
        }
    }
}
