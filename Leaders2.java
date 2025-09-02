import java.util.*;
public class Leaders2 {
    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Optional: reverse to maintain original left-to-right order
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        List<Integer> leaders = findLeaders(arr);

        System.out.print("Leaders are: ");
        for (int num : leaders) {
            System.out.print(num + " ");
        }
    }
}

