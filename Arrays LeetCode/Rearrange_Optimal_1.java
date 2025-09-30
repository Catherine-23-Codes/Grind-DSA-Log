import java.util.Arrays;

public class Rearrange_Optimal_1 {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        
        int[] rearranged = rearrangeArray(nums);
        
        System.out.println("Rearranged Array: " + Arrays.toString(rearranged));
    }
}
