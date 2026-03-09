public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";
        String normalized = original.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("The given string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + original + "\" is not a Palindrome.");
        }
    }
}