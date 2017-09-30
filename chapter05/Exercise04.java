/**
 * Exercise 5.4
 *
 * Write a method named checkFermat that takes four integers as parameters,
 * a, b, c and n - and checks to see if Fermat's theorem holds.
 *
 * For interesting near miss results, try the following:
 *
 * a = 1782, b = 1841, c = 1922, n = 12
 * a = 3987, b = 4365, c = 4472, n = 12
 *
 * @author Eli Heuer
 */

public class Exercise04 {

    public static void checkFermat(int a, int b, int c, int n) {

        double aToPowN = Math.pow(a, n);
        double bToPowN = Math.pow(b, n);
        double cToPowN = Math.pow(c, n);
        double aPlusBN = (aToPowN + bToPowN);
        System.out.println("(" + a + "^" + n + ") = " + aToPowN);
        System.out.println("(" + b + "^" + n + ") = " + bToPowN);
        System.out.println("(" + c + "^" + n + ") = " + cToPowN);
        System.out.println("a^n + b^n = " + aPlusBN);
        System.out.println(" ");

        if ((aToPowN + bToPowN) == cToPowN && (n<=2)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    public static void main(String[] args) {

        // a = 1782, b = 1841, c = 1922, n = 12
        // a = 3987, b = 4365, c = 4472, n = 12
        int a = 16;
        int b = 14;
        int c = 12;
        int n = 4;
        System.out.println("int a = " + a);
        System.out.println("int b = " + b);
        System.out.println("int c = " + c);
        System.out.println("int n = " + n);
        System.out.println(" ");

        checkFermat(a, b, c, n);
    }

} // End class
