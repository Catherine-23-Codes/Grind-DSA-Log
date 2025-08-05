import java.util.*;

public class Left_Rotate_D {
    public static void LeftRotateByD(int[]arr, int n, int k){
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        LeftRotateByD(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
