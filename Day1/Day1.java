public class Day1 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 30, 2};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}
