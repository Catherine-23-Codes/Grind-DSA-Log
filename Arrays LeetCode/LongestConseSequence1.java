public class LongestConseSequence1 {
    public static int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int longest = 1;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 1;

            // check next consecutive numbers using linear search
            while (contains(arr, num + 1)) {
                num++;
                count++;
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }

    // Linear search helper
    private static boolean contains(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println("Longest Consecutive Sequence length: " + longestConsecutive(arr));
    }
}


