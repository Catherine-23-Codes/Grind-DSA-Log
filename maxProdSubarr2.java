public class maxProdSubarr2 {
    public static int maxProductBetter(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];  // cumulative product
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray = " + maxProductBetter(arr));
    }
}


