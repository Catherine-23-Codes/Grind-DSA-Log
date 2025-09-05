public class findSingle_1 {
    // Function to find the element that appears once
    public static int findSingle(int[] arr) {
        int n = arr.length;

        // Outer loop to pick elements
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            // Inner loop to count occurrences of arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }

            // If count is 1, return that element
            if (count == 1) {
                return num;
            }
        }

        return -1; // if no unique element found
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Element appearing once: " + findSingle(arr));
    }
}

