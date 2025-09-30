import java.util.*;

public class ThreeSum_Better {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    result.add(triplet);
                } else {
                    seen.add(nums[j]);
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}
