import java.util.*;
public class Three_Sum_Brute {
    public static List<List<Integer>> ThreeSum(int[] arr){
        // to store unique elem we use SET
        Set<List<Integer>>set=new HashSet<>();
        int n=arr.length;
        
        //loops
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>triplet=Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
         return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>>result=ThreeSum(arr);
        System.out.println(result);
    }
}
