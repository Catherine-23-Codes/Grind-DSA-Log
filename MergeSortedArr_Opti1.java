import java.util.Arrays;
public class MergeSortedArr_Opti1 {

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int left = n - 1;
        int right = 0;

        // Swap if elements in arr1 are greater than arr2
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort both arrays again
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 4, 7, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.println("Merged arr1: " + Arrays.toString(arr1));
        System.out.println("Merged arr2: " + Arrays.toString(arr2));
    }
}

