import java.util.*;
public class FourSum2 {
    public static List<List<Integer>> four_sum(int[] arr, int target){
        Set<List<Integer>> set =new HashSet<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 Set<Long> hashset = new HashSet<>();
                 for(int k=j+1;k<n;k++){
                    long sum = (long) arr[i] + arr[j] + arr[k];
                    long fourth = (long) target - sum;
                    if (hashset.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                 }
                 hashset.add((long) arr[k]);
            }
        }
    }
    return new ArrayList<>(set);
}
public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = four_sum(nums, target);
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}