
import java.util.Arrays;
import java.util.Collections;

class ReverseWords {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }
}

class ReverseWordsDemo {

    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();

        System.out.println(obj.reverseWords("the sky is blue"));
        System.out.println(obj.reverseWords("  hello   world  "));
        System.out.println(obj.reverseWords("a good   example"));
    }
}
