import java.util.Scanner;

public class RemoveDuplicatesII{
    public static int removeDuplicates(int[] nums ){
        if(nums.length <= 2){
            return nums.length;
        }
        int k = 2;
        for (int i = 2 ;i < nums.length; i++){
           if (nums[i] != nums[k-2]){
               nums[k] = nums[i];
               k++;
           }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of element:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + "sorted integers separated by space: ");
        for(int i = 0 ; i<n ; i++) {
            nums[i] = scanner.nextInt();
        }
            int k = removeDuplicates(nums);
            System.out.println("\nNew length (k): "+ k );
            System.out.println("Modified array: [");
            for(int i = 0 ;i < k ;i++){
                System.out.println(nums[i] +(i < k - 1 ? ", " : "") );
            }
            System.out.println("]");
        scanner.close();
    }
}
