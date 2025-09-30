public class LinearSearch {
    public static int findLinearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, -21, 4, 0, 3};
        int target = 7;

        int index = findLinearSearch(arr, target);
        if (index != -1)
            System.out.println("The number " + target + " is at index: " + index);
        else
            System.out.println("Number not found in the array.");
    }
}
