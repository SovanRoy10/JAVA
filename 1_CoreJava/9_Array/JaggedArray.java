public class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array
        // internal array can have different sizes

        nums[0] = new int[3]; // Internal array 0 with size 3
        nums[1] = new int[2]; // Internal array 1 with size 2
        nums[2] = new int[4]; // Internal array 2 with size 4

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] =(int) (Math.random() *10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
