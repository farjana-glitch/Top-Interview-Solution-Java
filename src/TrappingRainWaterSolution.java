public class TrappingRainWaterSolution {

        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;

            int leftMax = 0;
            int rightMax = 0;
            int water = 0;

            while (left < right) {

                if (height[left] <= height[right]) {

                    if (height[left] >= leftMax) {
                        leftMax = height[left];
                    } else {
                        water += leftMax - height[left];
                    }

                    left++;

                } else {

                    if (height[right] >= rightMax) {
                        rightMax = height[right];
                    } else {
                        water += rightMax - height[right];
                    }

                    right--;
                }
            }

            return water;
        }
    }

    class TrappingRainWaterDemo {
        public static void main(String[] args) {

            TrappingRainWaterSolution solution =
                    new TrappingRainWaterSolution();

            int[] height1 = {4, 2, 0, 3, 2, 5};
            System.out.println(solution.trap(height1));

        }
    }