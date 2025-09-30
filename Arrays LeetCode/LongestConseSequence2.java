    import java.util.*;
public class LongestConseSequence2 {
    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        Arrays.sort(arr); // sort array

        int longest = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {       // consecutive
                count++;
            } else if (arr[i] != arr[i - 1]) {    // skip duplicates, reset count
                count = 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 1, 4};
        System.out.println("Longest Consecutive Sequence length: " + longestConsecutive(arr));
    }
}

