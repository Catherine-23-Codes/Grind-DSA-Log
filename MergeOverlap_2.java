// Merged overlaping subintervals OPTIMAL
import java.util.*;
public class MergeOverlap_2 {
    public static int[][] mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;

        // Step 1: Sort intervals based on start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        // Step 2: Traverse through intervals
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                // No overlap -> push interval
                ans.add(arr[i]);
            } else {
                // Overlap -> merge interval
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }

        // Step 3: Convert list to array
        return ans.toArray(new int[ans.size()][]);
    }

    // Main method for testing
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] result = mergeOverlappingIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

