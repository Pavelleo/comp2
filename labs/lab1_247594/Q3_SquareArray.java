public class Q3_SquareArray {

    public static int[] createArray(int size) {
        // Your code here
        int[] square = new int[size];
        for (int i = 0; i < size; i++) {
            square[i] = i * i;
        }
        return square;
    }

    public static void main(String[] args) {
        // Your code here
        int[] square = createArray(13);
        for (int i = 0; i < square.length; i++) {
            System.out.println("The square of " + i + " is: " + square[i]);
        }
    }
}