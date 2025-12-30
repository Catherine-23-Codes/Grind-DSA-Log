// this is an easy and simple straightforward problem
public class Max_Consecutive_1 {
    public static int FindMaxConsecutiveOnes(int[] arr){
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,1,-1,1,1,0,0,0,0,0,-1,1,-1,0};
        int result= FindMaxConsecutiveOnes(arr);
        System.out.println("The maxiumun consecutive ones are:"+result);
    }
}
