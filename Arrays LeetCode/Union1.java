import java.util.*;
public class Union1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Using TreeSet (keeps elements sorted)
        Set<Integer> set = new TreeSet<>();

        // Insert all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Insert all elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Union result
        List<Integer> union = new ArrayList<>(set);

        System.out.println("Union of two arrays: " + union);
    }
}


