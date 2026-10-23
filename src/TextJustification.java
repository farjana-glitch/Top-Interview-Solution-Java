import java.util.ArrayList;
import java.util.List;

    public class TextJustification {

        public List<String> fullJustify(String[] words, int maxWidth) {

            List<String> result = new ArrayList<>();
            int n = words.length;
            int i = 0;

            while (i < n) {

                int j = i;
                int letters = 0;

                // Find the maximum number of words for this line
                while (j < n &&
                        letters + words[j].length() + (j - i) <= maxWidth) {

                    letters += words[j].length();
                    j++;
                }

                int gaps = j - i - 1;
                StringBuilder line = new StringBuilder();

                // Last line or only one word: left-justify
                if (j == n || gaps == 0) {

                    for (int k = i; k < j; k++) {
                        if (k > i) {
                            line.append(' ');
                        }
                        line.append(words[k]);
                    }

                    while (line.length() < maxWidth) {
                        line.append(' ');
                    }

                } else {

                    int totalSpaces = maxWidth - letters;
                    int spacesPerGap = totalSpaces / gaps;
                    int extraSpaces = totalSpaces % gaps;

                    for (int k = i; k < j; k++) {
                        line.append(words[k]);

                        if (k < j - 1) {
                            int spaces = spacesPerGap;

                            if (k - i < extraSpaces) {
                                spaces++;
                            }

                            for (int s = 0; s < spaces; s++) {
                                line.append(' ');
                            }
                        }
                    }
                }

                result.add(line.toString());
                i = j;
            }

            return result;
        }
    }

    class TextJustificationDemo {

        public static void main(String[] args) {

            TextJustification obj = new TextJustification();

            String[] words = {
                    "This", "is", "an", "example",
                    "of", "text", "justification."
            };

            List<String> result = obj.fullJustify(words, 16);

            for (String line : result) {
                System.out.println("|" + line + "|");
            }
        }
}
