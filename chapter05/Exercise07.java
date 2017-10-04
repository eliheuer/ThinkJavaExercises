import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 5.7
 *
 *  Guess my number game,
 *  tells the user whether the guess is too high or too low,
 *  and then prompts the user for another guess.
 *
 * @author Eli Heuer
 */

public class Exercise07 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        message("I'm thinking of a number between 1 and 100");
        prompt("Guess the number: ");
        int guess = in.nextInt();
        checkNumber(guess, number(100));
    }

    public static int number(int r) {
        Random random = new Random();
        return random.nextInt(r) + 1;
    }

    public static void checkNumber(int guess, int number) {
        if (guess == number) {
            message("You guessed it! the number was: " + number);
            System.exit(0);
        } else if (guess > number) {
            prompt("Too high, try again: ");
        } else {
            prompt("Too low, try again: ");
        }
        guess = in.nextInt(); // Make a new guess
        checkNumber(guess, number);
    }

    public static void message(String m) {
        System.out.println(m);
    }

    public static void prompt(String p) {
        System.out.print(p);
    }
}
