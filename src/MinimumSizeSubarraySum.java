 public class MinimumSizeSubarraySum {
        public int minSubArrayLen(int target, int[] nums) {

            int left = 0;
            int sum = 0;
            int minLength = Integer.MAX_VALUE;
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    int length = right - left + 1;
                    minLength = Math.min(minLength, length);
                    sum -= nums[left];
                    left++;
                }
            }
            if (minLength == Integer.MAX_VALUE) {
                return 0;
            }
            return minLength;
        }
    }

    class MinimumSizeSubarraySumDemo {
        public static void main(String[] args) {
            MinimumSizeSubarraySum obj =
                    new MinimumSizeSubarraySum();
            int target = 7;
            int[] nums = {2, 3, 1, 2, 4, 3};
            int result = obj.minSubArrayLen(target, nums);
            System.out.println(result);
        }
}
