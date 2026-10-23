class FindIndex {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}

class FindIndexDemo {

    public static void main(String[] args) {
        FindIndex obj = new FindIndex();

        System.out.println(obj.strStr("sadbutsad", "sad"));
        System.out.println(obj.strStr("leetcode", "leeto"));
        System.out.println(obj.strStr("hello", "ll"));
    }
}
