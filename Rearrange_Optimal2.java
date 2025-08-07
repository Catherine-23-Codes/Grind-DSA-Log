import java.util.*;

public class Rearrange_Optimal2 {

    public static int[] alternateNumber(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, index = 0;

        // Step 2: Merge alternately
        while (i < pos.size() && i < neg.size()) {
            arr[index++] = pos.get(i);
            arr[index++] = neg.get(i);
            i++;
        }

        // Step 3: Add remaining elements from longer list
        while (i < pos.size()) {
            arr[index++] = pos.get(i++);
        }

        while (i < neg.size()) {
            arr[index++] = neg.get(i++);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, 3, -6};

        int[] result = alternateNumber(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
