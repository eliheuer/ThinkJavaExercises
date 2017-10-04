/**
 * Exercise 5.6
 *
 * Use a logical operator to simplify
 * a nested conditional statement.
 *
 * @author Eli Heuer
 */

public class Exercise06 {                                                // 001
    public class Buzz {                                                  // 002
        public static void baffle(String blimp) {                        // 000
        System.out.println(blimp);                                       // 000
        zippo("ping", -5);                                               // 000
    }

    public static void zippo(String quince, int flag) {                  // 004
        if (flag < 0) {                                                  // 000
            System.out.println(quince + " zoop");                        // 000
        } else {                                                         // 000
        System.out.println("ik");                                        // 000
        baffle(quince);                                                  // 000
        System.out.println("boo-wa-ha-ha");                              // 000
        }
    }

    public static void main(String[] args) {                             // 002
        zippo("rattle", 13);                                             // 003
    }
}
