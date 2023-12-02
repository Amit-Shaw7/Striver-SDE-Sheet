package O01SetMatrixZeroes;

public class Better {
    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        // Marking rows and columns as if either row or column has 0 
        // the entire row and col must be zero
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
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
                { 1, 3, 1, 0 },
        };
        setZeroes(arr);
        printMatrix(arr);
    }
}
