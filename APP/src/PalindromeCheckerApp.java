import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean checkPalindromeReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Two Pointer Method
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

    // Method 3: StringBuilder Method
    public static boolean checkPalindromeStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int runs = 1000;

        long start1 = System.nanoTime();
        for (int i = 0; i < runs; i++) {
            checkPalindromeReverse(input);
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        for (int i = 0; i < runs; i++) {
            checkPalindromeTwoPointer(input);
        }
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        for (int i = 0; i < runs; i++) {
            checkPalindromeStringBuilder(input);
        }
        long end3 = System.nanoTime();

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Reverse Method Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method Time: " + (end2 - start2) + " ns");
        System.out.println("StringBuilder Method Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}