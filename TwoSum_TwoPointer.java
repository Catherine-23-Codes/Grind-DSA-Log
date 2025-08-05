import java.util.*;
public class TwoSum_TwoPointer {
    public static int[] twoSumValues(int[] arr, int target) {
        Arrays.sort(arr); // Sorting the array
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{arr[left], arr[right]}; // Return values
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{}; // Return empty if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int[] result = twoSumValues(arr, target);

        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found with the given target.");
        }
    }
}
