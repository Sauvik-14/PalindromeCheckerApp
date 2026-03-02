import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Simple Two Pointer
    public static boolean twoPointer(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack Approach
    public static boolean stackMethod(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray())
            stack.push(c);

        for (char c : word.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Performance Test");
        System.out.println("Version: 1.0");

        String word = "madam";

        // Two Pointer timing
        long start1 = System.nanoTime();
        twoPointer(word);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        stackMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");

        System.out.println("Performance comparison completed.");
    }
}