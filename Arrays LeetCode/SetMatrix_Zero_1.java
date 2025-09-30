public class SetMatrix_Zero_1 {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Traverse and mark rows & cols with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark row
                    for (int col = 0; col < m; col++) {
                        if (matrix[i][col] != 0) matrix[i][col] = -1;
                    }
                    // mark column
                    for (int row = 0; row < n; row++) {
                        if (matrix[row][j] != 0) matrix[row][j] = -1;
                    }
                }
            }
        }

        // Step 2: Replace -1 with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Utility function to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeroes:");
        printMatrix(matrix);
    }
}


