//Type 2 method 1 simplified version without using formula! 
public class Pascal_Type2_11 {
    static void printNCR(int n) {
        long ans = 1;
        System.out.print(ans + " "); // first element of row is always 1

        for (int col = 1; col <= n; col++) {
            ans = ans * (n - col + 1);  // multiply by (n - col + 1)
            ans = ans / col;            // divide by col
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("Row " + n + ": ");
        printNCR(n);
    }
}

