package O01SetMatrixZeroes;

public class Optimal {
    public static void setZeroes(int[][] matrix) {
        // We are doing inplace operation hence

        // int[] row = new int[matrix.length]; -> matrix[0][...]
        // int[] col = new int[matrix[0].length]; -> matrix[...][j]

        int col0 = matrix[0][0];

        // Traversing to find zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    // Mark all rows
                    matrix[i][0] = 0;

                    // Mark all columns
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Traversing to solve the portioon other than first row and col
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Till now from col 1 row 1 ques is solved now we just wanna care about the first row and col
        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[i][0] = 0;
            }
        }

        // Printing
        printMatrix(matrix);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 },
        };
        setZeroes(arr);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Time Complexity - O[2(m*n)] -> Traversing 2 times
 */

/*
 * Space Complexity - O(1) - Just taking a variable
 */



