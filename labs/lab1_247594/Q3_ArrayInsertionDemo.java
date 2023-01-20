public class Q3_ArrayInsertionDemo {

    public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert) {
        int[] newArray = new int[beforeArray.length + 1];
        int done = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (indexToInsert == i) {
                newArray[i] = valueToInsert;
                done++;
            } else {
                newArray[i] = beforeArray[i - done];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] before = { 1, 5, 4, 7, 9, 3 };
        int indexin = 3;
        int valuein = 15;
        int[] after = insertIntoArray(before, indexin, valuein);

        System.out.println("Array before insertion:");
        for (int i = 0; i < before.length; i++) {
            System.out.println(before[i]);
        }
        System.out.println("Array after insertion of " + valuein + " at position " + indexin + ": ");
        for (int i = 0; i < after.length; i++) {
            System.out.println(after[i]);
        }
    }
}