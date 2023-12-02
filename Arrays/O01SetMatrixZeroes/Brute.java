package O01SetMatrixZeroes;
public class Brute {
    public static void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(i, matrix);
                    markCol(j, matrix);
                }
            }
        }

        markNegative1ToZero(matrix);
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

    public static void markNegative1ToZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int row, int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public static void markCol(int col, int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][col] != 0) {
                matrix[j][col] = -1;
            }
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