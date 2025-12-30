import java.util.Arrays;

public class LeftRotate_One {
    public static void Left_Rotate_Array_OnePlace(int[] arr) {
        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 9};

        Left_Rotate_Array_OnePlace(arr);
        System.out.println("The rotated array is: " + Arrays.toString(arr));
    }
}
