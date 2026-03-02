import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (char c : word.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String word) {
        return strategy.check(word);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");

        String word = "madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();  
        // Try: new DequeStrategy()

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.execute(word)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("System execution completed.");
    }
}