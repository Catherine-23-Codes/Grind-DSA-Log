import java.util.*;
public class maxSubarray1{
    public static int maxSubarraySum(int[]arr){
        int n=arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[]arr={1,-2,-3,4,-1,5,-3};
        System.err.println("The maximum subarray sum is:" +maxSubarraySum(arr));
    }
}