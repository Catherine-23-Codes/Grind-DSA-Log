import java.util.*;
public class S_Largest_Opti {
    public static int FindSecondlargest(int []arr){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        System.out.println("the largest element is:" +largest);
        return slargest;
    }
    public static void main(String[]args){
        int[]arr={1,9,5,-22,-7,0};
        int secondlargest=FindSecondlargest(arr);
        System.out.println("the second largest element is:"+secondlargest);
    }
}
