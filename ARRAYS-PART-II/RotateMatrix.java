class Solution {
    public void rotate(int[][] matrix) {
        int i, j, temp;
        int r = matrix.length;

        // Step 1: Transpose the matrix
        for (i = 0; i < r; i++) {
            for (j = i + 1; j < r; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (i = 0; i < r; i++) {
            for (j = 0; j < r / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][r - 1 - j];
                matrix[i][r - 1 - j] = temp;
            }
        }
    }
}