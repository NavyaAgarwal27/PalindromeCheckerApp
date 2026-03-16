import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method 1: Using reverse string
    public static boolean checkPalindromeReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Using two pointer technique
    public static boolean checkPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using StringBuilder reverse
    public static boolean checkPalindromeStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Algorithm 1 timing
        long start1 = System.nanoTime();
        boolean result1 = checkPalindromeReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Algorithm 2 timing
        long start2 = System.nanoTime();
        boolean result2 = checkPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Algorithm 3 timing
        long start3 = System.nanoTime();
        boolean result3 = checkPalindromeStringBuilder(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\n--- Results ---");

        System.out.println("Reverse Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nTwo Pointer Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        System.out.println("\nStringBuilder Method: " + result3);
        System.out.println("Execution Time: " + time3 + " ns");

        sc.close();
    }
}