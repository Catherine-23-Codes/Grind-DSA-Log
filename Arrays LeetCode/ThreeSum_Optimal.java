import java.util.*;
public class ThreeSum_Optimal {
    public static List<List<Integer>> three_sum(int[]nums){
         List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
        if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // Triplet found
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    // Skip duplicate 'j'
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // Skip duplicate 'k'
                    while (j < k && nums[k] == nums[k + 1]) k--;
               }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2};
        List<List<Integer>> result = three_sum(num);
        System.out.println(result);
    }
}
