import java.util.*;
public class majority_elem_3_3_1 {

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        Integer elem1 = null, elem2 = null;

        // Pass 1: Find up to two candidate elements
        for (int num : nums) {
            if (elem1 != null && num == elem1) {
                count1++;
            } else if (elem2 != null && num == elem2) {
                count2++;
            } else if (count1 == 0) {
                elem1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                elem2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Pass 2: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (elem1 != null && num == elem1) count1++;
            else if (elem2 != null && num == elem2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(elem1);
        if (count2 > n / 3) result.add(elem2);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 3, 3};
        System.out.println(majorityElement(arr)); // Output: [1, 2]
    }
}


