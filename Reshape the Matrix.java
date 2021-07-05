class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) != (r * c)) {
            return mat;
        }

        // store mat values into an array values.
        int[] values = new int [r*c];
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                values[index] = mat[i][j];
                index++;
            }
        }

        // pass values of mat into new_mat
        index = 0;
        int new_mat [][] = new int [r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                new_mat[i][j] = values[index];
                index++;
            }
        }
        return new_mat;
    }
}
