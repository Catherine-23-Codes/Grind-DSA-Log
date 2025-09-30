public class majorityElem1{
    public static int majorityElement(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if (cnt > n / 2) {
                return arr[i];
            }
        }

        // If no majority element exists
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
