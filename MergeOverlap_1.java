import java.util.*;
public class MergeOverlap_1 {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort by start
        int n=intervals.length;
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // merge with all overlapping intervals
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                    i = j; // skip merged
                } else break;
            }
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);

        for (int[] arr : merged) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

