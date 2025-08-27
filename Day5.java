// File: Day5.java
public class Day5 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // returns index if found
            }
        }
        return -1; // returns -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
