/**
 * Exercise 5.1
 *
 * Use a logical operator to simplify
 * a nested conditional statement.
 *
 * @author Eli Heuer
 */

public class Exercise01 {

    public static void main(String[] args) {
        int x = 9;
        if (x>0 && x<10) {
            message(x+" is a positive single digit number.");
        } else {
            message(x +" is not a positive single digit number.");
        }
        System.exit(0);
    }

    public static void message(String m) {
        System.out.println(m);
    }
}
