public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();
        String word = "deified";
        if (service.checkPalindrome(word)) {
            System.out.println("The given string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + word + "\" is not a Palindrome.");
        }
    }
}

class PalindromeService {
    public boolean checkPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return word.equals(reversed);
    }
}