 import java.util.Scanner;

    public class MajorityElement {

        // LeetCode-এর লজিক (Boyer-Moore Voting Algorithm)
        public static int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 0;

            for (int num : nums) {
                // যখন count ০ হয়ে যায়, তখন আমরা নতুন একটি ক্যান্ডিডেট বাছাই করি
                if (count == 0) {
                    candidate = num;
                }

                // যদি সংখ্যাটি ক্যান্ডিডেটের সমান হয়, তবে count ১ বাড়াব
                // অন্য সংখ্যা হলে count ১ কমাব
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter total number of elements: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter " + n + " integers separated by space:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            // ফাংশন কল
            int result = majorityElement(nums);

            System.out.println("\nMajority Element is: " + result);

            scanner.close();
        }
    }