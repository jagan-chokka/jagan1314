public class Day6 {

    public static void main(String[] args) {
        // Sample array
        int[] arr = {1000, 11, 445, 1, 330, 3000};

        // Edge case: handle empty or null arrays
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array starting from the second element
        // A single pass is sufficient to find both values.
        for (int i = 1; i < arr.length; i++) {
            // If current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }

            // If current element is smaller than min, update min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print the results
        System.out.println("Given Array: " + java.util.Arrays.toString(arr));
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}