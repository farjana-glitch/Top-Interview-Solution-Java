 import java.util.Arrays;
import java.util.Scanner;

    public class RotateArray {

        // ৩-ধাপের রিভার্স (Reverse) টেকনিক
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            // k যদি n এর চেয়ে বড় হয়, তাই k = k % n করে নিলাম
            k = k % n;

            // ১ম ধাপ: পুরো অ্যারে উল্টে ফেলা (0 থেকে n-1)
            reverse(nums, 0, n - 1);

            // ২য় ধাপ: প্রথম k টি উপাদান উল্টে ফেলা (0 থেকে k-1)
            reverse(nums, 0, k - 1);

            // ৩য় ধাপ: বাকি উপাদানগুলো উল্টে ফেলা (k থেকে n-1)
            reverse(nums, k, n - 1);
        }

        // হেলপার মেথড: অ্যারের নির্দিষ্ট অংশ রিভার্স/উল্টানোর জন্য
        private static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
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

            System.out.print("Enter steps to rotate (k): ");
            int k = scanner.nextInt();

            // ফাংশন কল
            rotate(nums, k);

            System.out.println("\nRotated Array: " + Arrays.toString(nums));

            scanner.close();
        }
    }