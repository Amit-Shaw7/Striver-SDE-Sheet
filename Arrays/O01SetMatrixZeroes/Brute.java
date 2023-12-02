package O01SetMatrixZeroes;

public class Brute {

    public static void setZeroes(int[][] matrix) {
        // Traversing and finding zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    changeWholeRow(matrix, i);
                    changeWholeColumn(matrix, j);
                }
            }
        }

        // Traversing and converting -1 to zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Printing matrix
        printMatrix(matrix);
    }

    public static void changeWholeRow(int[][] matrix, int row) {
        // Traversing through row and making it -1
        for (int j = 0; j < matrix[0].length; j++) {
            // We are avoiding to mainipulate the zeroes
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public static void changeWholeColumn(int[][] matrix, int col) {
        // Traversing through column and making it -1
        for (int i = 0; i < matrix.length; i++) {
            // We are avoiding to mainipulate the zeroes
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
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
                { 1, 3, 1, 5 },
        };
        setZeroes(arr);
    }
}

/*
 * Time Complexity - O[(m*n) * (m + n)] + [o(m*n)]
 * O[
 * => (m*n) - To traverse matrix
 * => (m + n) - To traverse row and column and change them to -1
 * ]
 * O[m*n] => To traverse and convert -1 to 0
 */

/*
 * Space Complexity - O[1]
 */

/*
 * Note - This will only work if any element is not -1 in the matrix
 */