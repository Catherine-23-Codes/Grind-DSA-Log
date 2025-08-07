import java.util.*;

public class FourSum1 {
    public static List<List<Integer>> Four_sum_brute(int[]arr, int target){
        int n=arr.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-2;k++){
                    for(int l=k+1;l<n;l++){
                        long sum=(long) arr[i]+arr[j]+arr[k]+arr[l];

                        if(sum==target){
                            List<Integer> quad= Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(quad);
                            set.add(quad);
                    }
                }
            }
        }
    }
    return new ArrayList<>(set);
  }
  public static void main(String[] args) {
    int[]arr={1,0,-1,0,-2,2};
    int target=0;
    List<List<Integer>> result=Four_sum_brute(arr, target);

    for(List<Integer>quad:result){
        System.out.println(quad);
    }
  }
}
