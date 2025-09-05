import java.util.HashMap;
public class findSingle_2 {
    // Function to find the element that appears once
    public static int findSingle(int[] arr) {
        int n = arr.length;

        // Step 1: Create a hashmap to store frequencies
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 2: Count occurrences
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        // Step 3: Find element with frequency 1
        for (int i = 0; i < n; i++) {
            if (freq.get(arr[i]) == 1) {
                return arr[i];
            }
        }

        return -1; // if no unique element found
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println("Element appearing once: " + findSingle(arr));
    }
}
