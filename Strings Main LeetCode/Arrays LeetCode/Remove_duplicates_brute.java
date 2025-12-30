import java.util.*;
public class Remove_duplicates_brute {
    public static int RemoveDuplicates_bruteforce(int[] nums){
        Set<Integer> set=new LinkedHashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        int index=0;
        for(int num:set){
            nums[index++]=num;
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,2,3,3,3,4,4};
        /* same elem repeated
        int[] nums={1,1,1,1,1,1,1,1,1};
       */ 

       /*
        mention in sorted order to get sorted o/p-  its an UNSORTED ARRAY
        int[] nums={-1,1,2,12,2,2,39,0,3,3,64,4}; 
        */

        int length=RemoveDuplicates_bruteforce(nums);
        System.out.println("the new length of set is:"+length);
        for(int i=0;i<length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}
 