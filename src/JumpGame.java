public class JumpGame {
    public static boolean canJump(int[] nums) {
            int farthest = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i > farthest) {
                    return false;
                }

                farthest = Math.max(farthest, i + nums[i]);
            }

            return true;
        }

        public static void main(String[] args) {
            int[] nums = {2, 3, 1, 1, 4};

            boolean result = canJump(nums);

            System.out.println("Can reach the last index: " + result);
        }
    }

