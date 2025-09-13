import java.util.*;
public class majority_elem_3_1 {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ans.size() == 0 || ans.get(0) != nums[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    ans.add(nums[i]);
                }
            }
            if (ans.size() == 2) break; // at most 2 majority elements possible
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums)); // Output: [3]
    }
}

