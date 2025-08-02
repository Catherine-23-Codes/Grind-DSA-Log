public class SLargest_Optimal {
    public static int secondLargest(int[]arr){
        int largest=arr[0];
        int slargest=-1;
        int n=arr.length-1;
        for(int i=1;i<=n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            } else if(arr[i]<largest && arr[i]> slargest){
                slargest=arr[i];
            }
        }
        System.out.println("The largest elem is:"+largest);
        return slargest;
    }
    public static void main(String args[]){
        int[] arr={1,5,2,14,13};
        int secLargest=secondLargest(arr);
        System.out.println("the second largest number is:"+ secLargest);
    }
}

/*
 * T.C = o(n)
 */