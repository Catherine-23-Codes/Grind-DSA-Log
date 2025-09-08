public class majorityElem_3 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        int cnt1 = 0;
        for (int num : nums) {
            if (num == candidate) cnt1++;
        }

        if (cnt1 > nums.length / 2) {
            return candidate;
        }
        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElement(nums));
    }
}

