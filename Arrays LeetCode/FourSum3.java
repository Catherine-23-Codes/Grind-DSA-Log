import java.util.*;
public class FourSum3 {
    public static List<List<Integer>> four_Sum(int[]nums, int target){
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            // to remove duplicates for first elem
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
            // to remove duplicates for second elem
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;      // third pointer
                int l = n - 1;      // fourth pointer

               while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        // Found a valid quadruplet
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;

                    } else if (sum < target) {
                        k++; // Need a bigger sum
                    } else {
                        l--; // Need a smaller sum
                    }
                }
            }
        }
           return ans;
    }
    public static void main(String[] args) {
        int[] nums={1, 1,1,2,2,2,3,3,3,4,4,4,5,5};
        int target = 8;

        List<List<Integer>> result = four_Sum(nums, target);
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
