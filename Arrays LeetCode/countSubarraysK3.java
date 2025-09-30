 import java.util.*;
public class countSubarraysK3 {
    public static int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // to handle subarrays starting at index 0
        int preSum = 0, cnt = 0;

        for (int num : arr) {
            preSum += num;
            cnt += map.getOrDefault(preSum - k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println(countSubarrays(arr, k)); 
    }
}

