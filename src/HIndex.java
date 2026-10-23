import java.util.Arrays;
public class HIndex {
    public static int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length;

            for (int h = n; h > 0; h--) {
                if (citations[n - h] >= h) {
                    return h;
                }
            }
            return 0;
        }
        public static void main(String[] args) {
            int[] citations = {3, 0, 6, 1, 5};
            int result = hIndex(citations);
            System.out.println("H-Index: " + result);
        }
    }
