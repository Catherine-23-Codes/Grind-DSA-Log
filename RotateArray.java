public class RotateArray {
    public static void leftRotate(int[] arr, int n, int k) {
        k = k % n;

        // Store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the front
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy temp elements to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 1, 3, 17, 9, 5};
        int k = 3;
        int n = arr.length;

        leftRotate(arr, n, k);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
