import java.util.*;
public class maxSubarray2 {
    public static int maxSubarraySum(int[]arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]arr={-2,-3,4,1,5,-3};
        System.out.println("The maxiumum subarray sum is:"+maxSubarraySum(arr));
    }
}
