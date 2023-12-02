package O01SetMatrixZeroes;

public class Brute2 {
    public static void setZeroes(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        // Traversing through matrix and finding zeroes and changing in the temp arr
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    changeWholeRow(temp, i);
                    changeWholeColumn(temp, j);
                }
            }
        }

        // Traversing and converting 1 to zeroes in the temp arr
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if (temp[i][j] == 1) {
                    temp[i][j] = 0;
                } else {
                    temp[i][j] = matrix[i][j];
                }
            }
        }

        // Printing matrix
        printMatrix(temp);
    }

    public static void changeWholeRow(int[][] matrix, int row) {
        // Traversing through row and making it -1
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 1;
        }
    }

    public static void changeWholeColumn(int[][] matrix, int col) {
        // Traversing through column and making it -1
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 1;
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
 * Time Complexity - O[(m*n) * (m + n)] + [o(m*n)]
 * O[
 * => (m*n) - To traverse matrix
 * => (m + n) - To traverse row and column and change them to -1
 * ]
 * O[m*n] => To traverse and convert -1 to 0
 */

/*
 * Space Complexity - O(m*n) - Ann array of size m*n
 */

/*
 * Note - This will work for all but this is the Brute force solution
 */
