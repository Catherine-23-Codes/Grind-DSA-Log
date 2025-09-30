import java.util.*;
public class maxSubarray3 {
    public static int maxSubarraySum(int[]arr){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum>max){
                max=sum;
            }
        
            if(sum<0){
                sum=0; // avoiding negative values
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("The largest subarray sum is:"+ maxSubarraySum(arr));
    }
}
