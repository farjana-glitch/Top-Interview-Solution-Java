public class ValidPalindrome {
    public boolean isPalindrome(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                if (!Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                else if (!Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                else if (Character.toLowerCase(s.charAt(left))
                        != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                else {
                    left++;
                    right--;
                }
            }

            return true;
        }
    }

    class ValidPalindromeDemo {

        public static void main(String[] args) {

            ValidPalindrome obj = new ValidPalindrome();

            System.out.println(
                    obj.isPalindrome("A man, a plan, a canal: Panama")
            );

            System.out.println(
                    obj.isPalindrome("race a car")
            );

            System.out.println(
                    obj.isPalindrome("madam")
            );
        }
    }