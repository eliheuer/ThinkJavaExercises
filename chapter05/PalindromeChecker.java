import java.util.Scanner;

public class PalindromeChecker {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String word = in.nextLine();
        message("Determining if it is a palindrome...");
        System.out.println(checkPalindrome(word));
    }

    public static boolean checkPalindrome(String word) {
        int wordLength = word.length();
        message("[ok] " + word);
        if (wordLength < 2) {
            return true;
        } else if (word.charAt(0) != word.charAt(wordLength - 1)) {
            return false;
            } else {
                return checkPalindrome(word.substring(1, wordLength - 1));
            }
        }

    public static void message(String m) {
        System.out.println(m);
    }
}
