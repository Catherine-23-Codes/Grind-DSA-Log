public class Pascal_Type2 {
// Recursive function using formula: nCr = (n-1)C(r-1) + (n-1)C(r)
    public static int nCr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    // Print nth row using loop like in SS
    public static void printRow(int n) {
        for (int c = 0; c <= n; c++) {
            System.out.print(nCr(n, c) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 6; // Example: 6th row
        printRow(n);
    }
}


