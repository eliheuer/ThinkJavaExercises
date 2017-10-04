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

        double aPowN = Math.pow(a, n);
        double bPowN = Math.pow(b, n);
        double cPowN = Math.pow(c, n);
        double aPlusB = aPowN + bPowN;
        message("(" + a + "**" + n + ") = " + aPowN);
        message("(" + b + "**" + n + ") = " + bPowN);
        message("(" + c + "**" + n + ") = " + cPowN);
        message("(a^n+b^n)  = " + aPlusB);

        if ((aPowN + bPowN) == cPowN && (n<=2)) {
            message("Holy smokes, Fermat was wrong!");
        } else {
            message("No, that doesn't work.");
        }
    }

    public static void main(String[] args) {

        // For interesting near miss results, try the following:
        // a = 1782, b = 1841, c = 1922, n = 12
        // a = 3987, b = 4365, c = 4472, n = 12

        int a = 1782; message("a = " + a);
        int b = 1841; message("b = " + b);
        int c = 1922; message("c = " + c);
        int n = 12;   message("n = " + n);

        checkFermat(a, b, c, n);
    }

    public static void message(String m) {
        System.out.println(m);
    }
}
