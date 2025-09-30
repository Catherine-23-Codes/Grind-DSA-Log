import java.util.*;
public class MergeSortedArr_Brute {
    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int[] arr3 = new int[n + m];
        int left = 0, right = 0, index = 0;

        // Merge both arrays into arr3
        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index++] = arr1[left++];
            } else {
                arr3[index++] = arr2[right++];
            }
        }

        // Copy remaining elements from arr1
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // Copy remaining elements from arr2
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        // Copy back to arr1 and arr2
        for (int i = 0; i < n + m; i++) {
            if (i < n) arr1[i] = arr3[i];
            else arr2[i - n] = arr3[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8};
        int[] arr2 = {2, 3, 5, 6};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}


