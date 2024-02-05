
public class Array {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5};

        //System.out.println(nums[0]); // get elements by index

        //looping 
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }

        // dynamic array
        int arr[]= new int[5]; // now all the 5 values are 0

        for(int i=0;i<arr.length;i++){
            arr[i] =i+1;
        }

        System.out.println(arr[4]);
        
    }
}
