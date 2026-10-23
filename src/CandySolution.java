import java.util.Arrays;

    public class CandySolution {
        public int candy(int[] ratings) {
            int n = ratings.length;

            int[] candies = new int[n];
            Arrays.fill(candies, 1);

            for (int i = 1; i < n; i++) {
                if (ratings[i] > ratings[i - 1]) {
                    candies[i] = candies[i - 1] + 1;
                }
            }

            for (int i = n - 2; i >= 0; i--) {
                if (ratings[i] > ratings[i + 1]) {
                    candies[i] = Math.max(
                            candies[i],
                            candies[i + 1] + 1
                    );
                }
            }

            int total = 0;

            for (int candy : candies) {
                total += candy;
            }

            return total;
        }
    }

    class CandyDemo {
        public static void main(String[] args) {
            CandySolution solution = new CandySolution();

            int[] ratings1 = {1, 0, 2};
            System.out.println(
                    "Output: " + solution.candy(ratings1)
            );

            int[] ratings2 = {1, 2, 2};
            System.out.println(
                    "Output: " + solution.candy(ratings2)
            );

            int[] ratings3 = {1, 3, 4, 5, 2};
            System.out.println(
                    "Output: " + solution.candy(ratings3)
            );
        }
    }