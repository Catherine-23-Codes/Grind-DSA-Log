public class Smallest_optimal {
    public static void Smallest(int[]arr){
        int smallest=arr[0];
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("the smallest elem is:" + smallest);
    }
    public static void main(String[] args) {
        int[]arr={1,-2,4,5,3};
        Smallest(arr);
    }
}
