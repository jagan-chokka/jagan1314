import java.util.Arrays;

public class Day10 {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("Sorted Array:   " + Arrays.toString(numbers));
    }
}