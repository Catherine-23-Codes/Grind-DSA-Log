import java.util.*;

public class TwoSumHashMap {
    public static int[] twoSum(int[] arr, int target) {
        // Store number as key and its index as value
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                // Found the pair
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        // No pair found
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int[] result = twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
