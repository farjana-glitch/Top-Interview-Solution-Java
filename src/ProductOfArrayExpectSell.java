import java.util.Arrays;

    class ProductOfArrayExceptSell {

        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] answer = new int[n];

            int left = 1;

            for (int i = 0; i < n; i++) {
                answer[i] = left;
                left = left * nums[i];
            }

            int right = 1;

            for (int i = n - 1; i >= 0; i--) {
                answer[i] = answer[i] * right;
                right = right * nums[i];
            }

            return answer;
        }
    }

    class ProductExceptSelfDemo {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4};

            int[] result =
                    ProductOfArrayExceptSell.productExceptSelf(nums);

            System.out.println("Output: " + Arrays.toString(result));
        }
    }