// Type 2 method 2 without using formula! 
public class Pascal_Type2_1 {
    // Function to calculate nCr
    public static long nCr(int n, int r) {
        // Edge cases
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;

        // Since nCr = nC(n-r), take the smaller r
        r = Math.min(r, n - r);

        long result = 1;

        // Compute iteratively to avoid factorial overflow
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println("nCr = " + nCr(n, r)); // Output: 10
    }
}
 
