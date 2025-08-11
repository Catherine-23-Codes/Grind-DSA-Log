public class LongestSubarray1 {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        // Check all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 2, 7, -1, 0, 6, 1};
        int k = 10;
        int length = longestSubarrayWithSumK(arr, k);
        System.out.println("Longest subarray length with sum " + k + " is: " + length);
    }
}
