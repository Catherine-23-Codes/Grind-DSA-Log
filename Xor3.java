import java.util.*;
public class Xor3 {

    public static int countSubarraysOptimal(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;

        for (int num : arr) {
            xor ^= num;

            if (xor == k) count++;

            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println("Optimal: " + countSubarraysOptimal(arr, k));
    }
}


