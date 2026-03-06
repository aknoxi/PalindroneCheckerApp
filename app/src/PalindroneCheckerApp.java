import java.util.Scanner;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main (String[] args ){

        System.out.println("welcome to the palindrome checker app!!!");
        String word = "madam";


        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }


        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
        // Hardcoded string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
        String word = "radar";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to create reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();


    }
}
