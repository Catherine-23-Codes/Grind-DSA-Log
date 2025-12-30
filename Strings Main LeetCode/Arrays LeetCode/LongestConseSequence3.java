import java.util.*;
public class LongestConseSequence3 {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        // put all numbers in a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int longest = 1;

        // iterate through each number
        for (int num : set) {
            // only start when num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                int x = num;

                // expand the sequence
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 1, 4};
        System.out.println("Longest Consecutive Sequence length: " + longestConsecutive(arr));
    }
}

