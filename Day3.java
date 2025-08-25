public class Day3 {
    // Function to check if array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // not sorted
            }
        }
        return true; // sorted
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 2, 4, 1};

        System.out.println("Array 1 sorted? " + isSorted(arr1)); // true
        System.out.println("Array 2 sorted? " + isSorted(arr2)); // false
    }
}
