public class findMissingNo1 {
    public static int findMissingNumber(int[] arr, int n) {
        // Check numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            boolean flag = false;

            // Search if i exists in array
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }

            // If i is not found, it's the missing number
            if (!flag) {
                return i;
            }
        }
        return -1; // should never reach here
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Example
        int n = 5; // Numbers should be from 1 to 5

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}
