import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "civic";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        System.out.println("Using StackStrategy: " + (strategy.isPalindrome(word) ? "Palindrome" : "Not Palindrome"));

        strategy = new DequeStrategy();
        System.out.println("Using DequeStrategy: " + (strategy.isPalindrome(word) ? "Palindrome" : "Not Palindrome"));
    }
}

interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : word.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;}}