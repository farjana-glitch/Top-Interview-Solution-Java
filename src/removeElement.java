public class removeElement {
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int len = nums.length;
            int i = 0;

            while (i < len) {
                if (nums[i] == val) {
                    nums[i] = nums[len - 1]; // শেষের উপাদান সামনে আনলাম
                    len--;                   // অ্যারের সাইজ ১ কমাব (এটি মিসিং ছিল!)
                } else {
                    i++;                     // ম্যাচ না করলে পরের ঘরে যাব
                }
            }

            return len;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int newLength = solution.removeElement(nums, val);

        System.out.println("New Length: " + newLength);
        System.out.print("Array elements after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}