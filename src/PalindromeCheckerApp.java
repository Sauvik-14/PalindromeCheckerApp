public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");

        // Hardcoded string
        String word = "madam";

        // Palindrome check
        if (word.equals("madam")) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("System execution completed.");
    }
}