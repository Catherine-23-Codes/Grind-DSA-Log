public class maxProdSubarr1 {
    public static int maxProductTripleLoop(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= nums[k];  // multiply elements between i and j
                }
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray = " + maxProductTripleLoop(arr));
    }
}


