public class Pascal_Type1 {
    public static long nCr(int n, int r) {
        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 10, r = 3;
        System.out.println("nCr = " + nCr(n, r)); 
    }
}

