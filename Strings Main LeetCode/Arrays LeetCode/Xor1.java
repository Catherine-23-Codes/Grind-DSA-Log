public class Xor1 {
    public static int countSubarraysBrute(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int xor = 0;
                for (int m = i; m <= j; m++) {
                    xor ^= arr[m];
                }
                if (xor == k) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Brute: " + countSubarraysBrute(arr, k));
    }
}


