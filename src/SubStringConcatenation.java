import java.util.*;
public class SubStringConcatenation {
    public static List<Integer> findSubstring(
                String s, String[] words) {
            List<Integer> result = new ArrayList<>();

            if (s == null || words == null || words.length == 0) {
                return result;
            }
            int wordLen = words[0].length();
            int totalWords = words.length;
            if (s.length() < wordLen * totalWords) {
                return result;
            }
            Map<String, Integer> targetMap = new HashMap<>();
            for (String word : words) {
                targetMap.put(word, targetMap.getOrDefault(word, 0) + 1);
            }
            for (int offset = 0; offset < wordLen; offset++) {
                int left = offset;
                int count = 0;
                Map<String, Integer> seen = new HashMap<>();
                for (int right = offset;
                     right + wordLen <= s.length();
                     right += wordLen) {
                    String word = s.substring(right, right + wordLen);
                    if (!targetMap.containsKey(word)) {
                        seen.clear();
                        count = 0;
                        left = right + wordLen;
                        continue;
                    }
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;
                    while (seen.get(word) > targetMap.get(word)) {
                        String leftWord = s.substring(
                                left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                    if (count == totalWords) {
                        result.add(left);

                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            String s = "barfoothefoobarman";
            String[] words = {"foo", "bar"};
            System.out.println(findSubstring(s, words));
        }
    }
