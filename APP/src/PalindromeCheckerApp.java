public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String word = "noon";
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is not a Palindrome.");
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
}