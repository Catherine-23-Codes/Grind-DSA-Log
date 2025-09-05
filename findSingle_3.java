public class findSingle_3 {
    public static int findSingle(int[] arr) {
        int xor = 0;

        // XOR of all elements
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("Element appearing once: " + findSingle(arr));
    }
}
