class PalindromeChecker {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String word) {

        if (word == null)
            return false;

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
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");

        String word = "madam";

        // Object creation (Encapsulation)
        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("System execution completed.");
    }
}