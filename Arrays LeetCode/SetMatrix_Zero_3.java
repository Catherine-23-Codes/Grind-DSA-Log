public class SetMatrix_Zero_3 {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean col0 = true; // track first column separately

        // Step 1: Mark rows & cols in the first row/col
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) col0 = false; // first col check
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark col
                }
            }
        }

        // Step 2: Update matrix based on marks (skip first row/col for now)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first col
        if (!col0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Utility to print matrix
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
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeroes:");
        printMatrix(matrix);
    }
}
