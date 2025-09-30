import java.util.*;
public class Pascal_Type_3_1 {

    // Function to generate a single row:
    public static List<Integer> generateRow(int row) {
        List<Integer> ansRow = new ArrayList<>();
        long ans = 1;
        ansRow.add(1); // first element is always 1

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    // Function to generate entire Pascal's Triangle:
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> triangle = pascalTriangle(n);

        for (List<Integer> row : triangle) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

