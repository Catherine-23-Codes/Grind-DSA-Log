import java.util.Arrays;
public class DNF_Brute {
    public static void sortColors(int[] arr) {
        // Brute Force: Use built-in sort (O(n log n))
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        
        sortColors(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


