public class Largest_Optimal_2 {
    public static int Largest(int[]arr){
        int largest1=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            if(arr[i]>largest1){
                largest1=arr[i];
            }
        }
        return largest1;
    }
    public static void main(String[] args) {
        int[]arr={1,5,3,-2,0};
        int largest1= Largest(arr);
        System.out.println("the largest elem is:" + largest1);
    }
}
