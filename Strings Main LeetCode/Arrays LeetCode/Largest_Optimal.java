public class Largest_Optimal {
    public static void FindLargest(int[]arr){
        int largest=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest elem is:"+ largest);
    }
    public static void main(String[] args){
        int[]arr={1,5,2,-4,3,1};
        FindLargest(arr);
    }
}
