public class LargestSubarray_0_Sum {
    public static int largestSubarrayZeroSum(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        // Check all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of largest subarray with 0 sum: " 
                           + largestSubarrayZeroSum(arr));
    }
}

/*
 * T.C = O(n²)
 * S.C = 0(1)
 */