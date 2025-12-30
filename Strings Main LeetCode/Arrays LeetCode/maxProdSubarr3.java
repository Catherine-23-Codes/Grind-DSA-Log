public class maxProdSubarr3 {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // reset prefix if it becomes 0
            if (prefix == 0) prefix = 1;
            // reset suffix if it becomes 0
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 3, -4};
        System.out.println("Maximum Product Subarray = " + maxProduct(arr));
    }
}


