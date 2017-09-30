/**
 * Exercise 5.5
 *
 * @author Eli Heuer
 */

public class Exercise05 {

    public static void song(int bottles) {
        if(bottles == 0){
            System.out.println(); // Print blank Line
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer.");
            System.out.println("Ya' can't take one down, ");
            System.out.println("ya' can't pass it around,");
            System.out.println("'cause there are no more ");
            System.out.println("bottles of beer on the wall!");
        } else {
            System.out.println(); // Print blank line
            System.out.println(bottles + " bottles of beer on the wall,");
            System.out.println(bottles + " bottles of beer.");
            System.out.println("Ya' take one down,"); 
            System.out.println("ya' pass it around,");
            bottles --; // Subtract one from bottles
            System.out.println(bottles + " bottles of beer on the wall.");
            song(bottles);
        }
    }

    public static void main(String[] args) {
        int bottles = 99; // 'n' number of bottles
        song(bottles); // Start song at 'n' number of bottles
    }
}

