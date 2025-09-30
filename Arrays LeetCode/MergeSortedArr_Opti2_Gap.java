// GAP Method or Shell Sort method- Optimal soln 2

import java.util.*;
public class MergeSortedArr_Opti2_Gap {
    // Swap elements if arr1[ind1] > arr2[ind2]
    private static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    // Merge two sorted arrays without extra space
    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2); // Initial gap

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // Case 1: both pointers in arr1
                if (left < n && right < n) {
                    swapIfGreater(arr1, arr1, left, right);
                }
                // Case 2: left in arr1, right in arr2
                else if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // Case 3: both pointers in arr2
                else {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2); // Reduce gap
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        System.out.println("Before merging:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("\nAfter merging:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
