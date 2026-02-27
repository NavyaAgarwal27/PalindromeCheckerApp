public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String word = "racecar";
        char[] chars = word.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        https://github.com/NavyaAgarwal27/PalindromeCheckerApp/tree/UC4-ArrayBased

        if (isPalindrome)
        {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is not a Palindrome.");
        }
            }
        }
