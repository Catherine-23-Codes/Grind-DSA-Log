import java.util.*;
public class moveZeroes_brute {
    public static void moveZeroes(int[]arr){
        int n=arr.length;
        int[]temp=new int[n];
        int index=0;

    // copying non-zeroes elem to temp array
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[index++]=arr[i];
            }
        }
    // filling rest positions with zeroes
    while(index<n){
        temp[index++]=0;
    }

    // copying back non zero elem to original array
    for(int i=0;i<n;i++){
        arr[i]=temp[i];
    }
  }
  public static void main(String[] args) {
    int[]arr={1,0,5,2,0,0,6,9,0,4};
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
  }
}
