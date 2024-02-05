public class WhileLoop {
    public static void main(String[] args) {
        // int i=0;
        // while(i<=5){
        //     System.out.println(i++);
        // }

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}