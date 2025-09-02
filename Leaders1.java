import java.util.*;
public class Leaders1 {
    // Function to print leaders in an array
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        System.out.print("Leaders are: ");

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        printLeaders(arr);
    }
}


