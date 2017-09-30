/**
 * Exercise 5.1
 *
 * Use a logical operator to simplify a nested conditional statement.
 *
 * @author Eli Heuer
 */

public class Exercise01 {
    public static void main(String[] args) {
        int x = 8;
        if (x>0 && x<10) {
            System.out.println(x + " is a positive single digit number.");
        } else {
            System.exit(0);
        }
    }
}
