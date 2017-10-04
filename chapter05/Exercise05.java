/**
 * Exercise 5.5
 * 
 * The purpose of this exercise is to take a problem and break
 * it into smaller problems, and to solve the smaller problems 
 * by writing simple methods. Consider the first verse of the 
 * song "99 Bottles of Beer":
 * 
 * @author Eli Heuer
 */

public class Exercise05 {

    public static void song(int bottles) {
        System.out.println(); // Print blank Line
        if(bottles == 0){
            message("No bottles of beer on the wall,");
            message("no bottles of beer.");
            message("Ya' can't take one down, ");
            message("ya' can't pass it around,");
            message("'cause there are no more ");
            message("bottles of beer on the wall!");
        } else {
            message(bottles + " bottles of beer on the wall,");
            message(bottles + " bottles of beer.");
            message("Ya' take one down,");
            message("ya' pass it around,");
            bottles --; // Subtract one from bottles
            message(bottles + " bottles of beer on the wall.");
            song(bottles);
        }
    }

    public static void main(String[] args) {
        int bottles = 99; // 'n' number of bottles
        song(bottles); // Start song at 'n' number of bottles
    }

    public static void message(String m) {
        System.out.println(m);
    }
}
