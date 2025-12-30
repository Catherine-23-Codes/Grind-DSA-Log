// optimal solution using Two pointers
// works only for positives and zeroes

public class LongestSubarray3 {
    public static int longestSubarraySumK(int[] arr, int k) {
        int left = 0, right = 0;
        int n = arr.length;
        int maxLen = 0;
        int sum = arr[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += arr[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println("The longest subarray length is: " + longestSubarraySumK(arr, k));
    }
}
