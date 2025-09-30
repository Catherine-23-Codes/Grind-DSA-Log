// Better method- using hashing & prefixsum --
// works for negative positive and zeroes also

import java.util.*;
public class LongestSubarray2 {
    public static int LongestSubarraySum(int[] arr, long k){
        Map<Long,Integer>map=new HashMap<>();
        long sum=0;
        int maxLength=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k) maxLength=i+1;

            if(map.containsKey(sum-k)){
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={2, -1, -2, -1, -3, 4};
        long k = 1;
        System.out.println("The longest subarray is:" + LongestSubarraySum(arr, k));
    }
}
