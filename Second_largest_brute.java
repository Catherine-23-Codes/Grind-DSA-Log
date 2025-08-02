import java.util.*;
public class Second_largest_brute {
    public static void Second_largest(int[]arr){
        int n=arr.length-1;
        Arrays.sort(arr);
        int largest=arr[n-1];
        int second_largest=arr[n-2];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=largest){
                 second_largest=arr[i];
               break;
                }/*else{
                second_largest=-1;
                }*/
        }
        System.out.println("the second largest elem is:"+second_largest);  
    }
    public static void main(String args[]){
        int[] arr={1,7,2,4,9,3,12};
        Second_largest(arr);
    }
}

/*
 * T.C= N log N + N
 */