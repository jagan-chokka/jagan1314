public class Day7 {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target1 = 23;
        int target2 = 15;

        int result1 = binarySearch(sortedNumbers, target1);

        if (result1 == -1) {
            System.out.println("Element " + target1 + " not found in the array.");
        } else {
            System.out.println("Element " + target1 + " found at index: " + result1);
        }

        int result2 = binarySearch(sortedNumbers, target2);

        if (result2 == -1) {
            System.out.println("Element " + target2 + " not found in the array.");
        } else {
            System.out.println("Element " + target2 + " found at index: " + result2);
        }
    }
}