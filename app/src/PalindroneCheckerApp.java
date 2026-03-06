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

    }
}
