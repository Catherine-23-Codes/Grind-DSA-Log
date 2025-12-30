import java.util.*;
public class BruteLargest {
    public static int LargestElem(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr={1,5,7,2,3,-4,0};
        int largest=LargestElem(arr);
        System.out.println("The largest elem is:"+ largest);
    }
}
