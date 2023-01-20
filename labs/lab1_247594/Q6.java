import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        double[] notes = new double[10];

        System.out.println("Give me 100 numbers between 0 to 100, in order \n");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            notes[i] = new Scanner(System.in).nextDouble();
        }

        System.out.println("average: " + calculateAverage(notes));
        System.out.println("median: " + calculateMedian(notes));
        System.out.println("amount failed: " + calculateNumberFailed(notes));
        System.out.println("amount passed: " + calculateNumberPassed(notes));

        // your code here

    }

    public static double calculateAverage(double[] notes) {
        double note = 0;

        for (int i = 0; i < notes.length; i++) {
            note += notes[i];
        }

        return note / notes.length;
    }

    public static double calculateMedian(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = i + 1; j < notes.length; j++) {
                double temp;
                if (notes[i] < notes[j]) {
                    temp = notes[i];
                    notes[i] = notes[j];
                    notes[j] = temp;
                }
            }
        }

        if (notes.length % 2 == 0) {
            return (notes[((int) (notes.length / 2)) - 1] + notes[((int) (notes.length / 2))]) / 2;
        } else {
            return (notes[(int) (notes.length / 2)]);
        }
    }

    public static int calculateNumberFailed(double[] notes) {
        int failed = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < 50.0) {
                failed++;
            }
        }

        return failed;
    }

    public static int calculateNumberPassed(double[] notes) {
        int passed = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 50.0) {
                passed++;
            }
        }

        return passed;
    }

}