import java.util.*;
public class KadaneSubarray {
    public static void maxSubarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;  // potential start of subarray
            }

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;  // reset
            }
        }

        // Print result
        System.out.println("Maximum Subarray Sum = " + maxi);
        System.out.print("Subarray: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + (i < ansEnd ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarraySum(arr);
    }
}
