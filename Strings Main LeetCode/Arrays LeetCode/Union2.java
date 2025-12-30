import java.util.*;
public class Union2 {
  
    // Function to find union of two sorted arrays
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;

        ArrayList<Integer> unionArr = new ArrayList<>();

        // Traverse both arrays
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.size() == 0 || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }

        // Add remaining elements of a[]
        while (i < n1) {
            if (unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        // Add remaining elements of b[]
        while (j < n2) {
            if (unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        return unionArr;
    }

    // Main function (psvm)
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        ArrayList<Integer> result = findUnion(arr1, arr2);

        System.out.println("Union of two sorted arrays: " + result);
    }
}

