package O01SetMatrixZeroes;

public class Better {
    public static void setZeroes(int[][] matrix) {
        // Takinng two 1D array to store mark the col and row if any xero encounters
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        // Traversing to find zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Traversig again to get the final result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        //Printing
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 0 },
        };
        setZeroes(arr);
        printMatrix(arr);
    }
}

/*
 * Time Complexity - O(m*n) + o(m*n)
 * => O(m*n) - To traverse matrix and mark the row and column array
 * => O(m*n) - To traverse matrix and get the finnal result
 */

/*
 * Space Complexity - O(m) + O(n) - Two 1D array of size m and n
 */
