public class Second_smallest {
    public static int FindSecondSmallest(int[]arr){
        int smallest=Integer.MAX_VALUE;
        int s_smallest=Integer.MIN_VALUE;
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            if(arr[i]<smallest){
                s_smallest=smallest;
                smallest=arr[i];
            } else if(arr[i]>smallest && arr[i]<s_smallest){
                s_smallest=arr[i];
            }
        }
        System.out.println("the smallest value is:"+smallest);
        return s_smallest;
    }
    public static void main(String[] args) {
        int[]arr={1,14,-2,7,6,10};
        int smallestvalue=FindSecondSmallest(arr);
        System.out.println("the second smallest value is:"+smallestvalue);
    }
}
