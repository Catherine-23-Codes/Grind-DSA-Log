public class findMissingNo3 {
    public static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;

        // XOR of array elements and numbers 1..n
        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i];   // XOR of given array
            xor1 = xor1 ^ (i + 1);  // XOR of numbers from 1 to n-1
        }

        // Include n in xor1
        xor1 = xor1 ^ n;

        // Missing number = xor1 ^ xor2
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Example
        int n = 5; // Numbers should be from 1 to 5

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}

