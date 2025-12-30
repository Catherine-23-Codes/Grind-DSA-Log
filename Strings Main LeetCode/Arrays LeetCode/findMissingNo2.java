public class findMissingNo2 {
    public static int findMissingNumber(int[] arr, int n) {
        // Step 1: Create a hash array of size n+1 (1-based indexing)
        int[] hash = new int[n + 1];

        // Step 2: Mark the elements present in arr
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]] = 1;
        }

        // Step 3: Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1; // should never reach here
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Example array
        int n = 5; // numbers should be from 1 to 5

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}

