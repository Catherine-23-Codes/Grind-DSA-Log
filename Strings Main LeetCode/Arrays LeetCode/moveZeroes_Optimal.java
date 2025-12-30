import java.util.Arrays;

public class moveZeroes_Optimal {
    public static void moveZeros(int[]arr){
        int j=-1;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)   return;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,0,5,0,2,0,7,0};
        System.out.println("Before:"+Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After:"+Arrays.toString(arr));

    }
}
