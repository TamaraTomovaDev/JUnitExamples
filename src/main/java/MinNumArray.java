public class MinNumArray {
    public static int findMin(int[] array) {
        int min = array[0]; // array bevat minstens een element

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
