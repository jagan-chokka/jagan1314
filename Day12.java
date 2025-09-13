// Day 12: Quick Sort Algorithm
import java.util.Arrays;

public class Day12 {

    // A helper function to swap two elements in an array.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes the last element as a pivot,
       places the pivot element at its correct position in the sorted array,
       and places all smaller elements to the left of the pivot and
       all greater elements to the right. */
    private static int partition(int[] arr, int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];

        // Index of the smaller element
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Swap the pivot element (arr[high]) with the element at the partition point (i + 1)
        swap(arr, i + 1, high);
        
        // Return the partitioning index
        return (i + 1);
    }

    // The main function that implements QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array:   " + Arrays.toString(numbers));
    }
}