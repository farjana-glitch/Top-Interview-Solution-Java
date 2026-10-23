public class LengthOfLastWordSolution {

        public int lengthOfLastWord(String s) {
            int length = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);

                if (ch == ' ') {
                    if (length > 0) {
                        break;
                    }
                } else {
                    length++;
                }
            }

            return length;
        }
    }

    class LengthOfLastWordDemo {
        public static void main(String[] args) {
            LengthOfLastWordSolution solution =
                    new LengthOfLastWordSolution();

            System.out.println(
                    solution.lengthOfLastWord("Hello World")
            );

            System.out.println(
                    solution.lengthOfLastWord("   fly me   to   the moon  ")
            );

            System.out.println(
                    solution.lengthOfLastWord("luffy is still joyboy")
            );
        }
    }
