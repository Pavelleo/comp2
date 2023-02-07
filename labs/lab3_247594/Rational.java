public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
        // Your code here
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
        // Your code here
    }

    // getters

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {

        int top = ((numerator * other.denominator) + (other.numerator * denominator));
        int bot = (denominator * other.denominator);
        Rational bob = new Rational(top, bot);
        bob.reduce();
        return bob;
        // Your code here
    }

    public static Rational plus(Rational a, Rational b) {
        // Your code here
        int top = ((a.numerator * b.denominator) + (b.numerator * a.denominator));
        int bot = (a.denominator * b.denominator);
        Rational bob = new Rational(top, bot);
        return bob;
    }

    // Transforms this number into its reduced form

    private void reduce() {
        // Your code here
        int div = denominator;
        for (int i = 0; i < denominator; i++) {
            if (numerator % div == 0 && denominator % div == 0) {
                numerator /= div;
                denominator /= div;
                break;
            }
            div--;
        }
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
        // Note that the loop below, as-is, will time out on negative inputs.
        // The gcd should always be a positive number.
        // Add code here to pre-process the inputs so this doesn't happen.

        while (a != b)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return a;
    }

    public int compareTo(Rational other) {
        // Your code here
        float num = (float) numerator / denominator;
        float othernum = (float) other.numerator / other.denominator;
        if (num < othernum) {
            return -1;
        } else if (num > othernum) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Rational other) {
        // Your code here
        if (other.numerator / other.denominator == numerator / denominator) {
            return true;
        }
        return false;
    }

    public String toString() {
        String result;
        if (denominator == 1) {
            // Your code here
            result = Integer.toString(numerator);
        } else {
            // Your code here
            result = Integer.toString(numerator) + "/" + Integer.toString(denominator);
        }
        return result;
    }

}