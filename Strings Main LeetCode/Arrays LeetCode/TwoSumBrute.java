public class TwoSumBrute {
    public static int[] Two_Sum(int[]arr, int n, int target){

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                return new int[] {i,j};
            }
        }
    }
    return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr={3,14,6,5};
        int target=89;
        int n=arr.length;
        int[] result=Two_Sum(arr,n, target);

        if(result.length==2){
            System.out.println("Indices:"+ result[0]+"," + result[1]);
            System.out.println("Numbers:"+arr[result[0]]+","+ arr[result[1]]);
        }else{
            System.out.println("2 Sum solution is not found!");
        }
    }
}
