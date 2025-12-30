import java.util.*;
class Largest_Brute{
    // return type should be int 
    public static int LargestElem(int[] arr){
        //Sorting
        Arrays.sort(arr);
        
        //return the largest elem
        return arr[arr.length-1];
    }
    public static void main(String args[]){
        int[] arr={2,1,4,5,3,2};
        int FindLargest= LargestElem(arr);
        System.out.println("the largest elem is:"+ FindLargest);
    }
}

/*
 * T.C= O(N log N)
 * S.C= O(1);
 */