import java.util.*;
public class majority_elem_3_2 {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int limit = n / 3;                  // ⌊ n/3 ⌋
        
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            // Once count exceeds n/3, add to result and remove from map
            // to avoid duplicates.
            if (freq.get(num) == limit + 1) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 2, 2, 2};
        System.out.println(majorityElement(arr));  // Output: [1, 2]
    }
}

