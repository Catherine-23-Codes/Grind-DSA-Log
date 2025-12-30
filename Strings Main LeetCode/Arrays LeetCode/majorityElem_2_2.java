import java.util.*;
public class majorityElem_2_2 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElement(nums));
    }
}

