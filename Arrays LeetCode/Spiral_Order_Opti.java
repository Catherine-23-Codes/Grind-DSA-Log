import java.util.*;
public class Spiral_Order_Opti{
  public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        if (matrix.length == 0) return ans;

        int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        
        while (top <= bottom && left <= right) {
            // Traverse left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            
            // Traverse top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            
            // Traverse right to left (only if top <= bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Traverse bottom to top (only if left <= right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        System.out.println(spiralOrder(matrix));
    }
}

