using System;

public class Solution {
    public int[][] Transpose(int[][] matrix) {
        int rows = matrix.Length;
        int cols = matrix[0].Length;
        
      
        if (rows == cols) {
            int n = rows;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
 
        else {
            int[][] res = new int[cols][];
            for (int i = 0; i < cols; i++) {
                res[i] = new int[rows];
                for (int j = 0; j < rows; j++) {
                    res[i][j] = matrix[j][i]; 
                }
            }
            return res;
        }
    }
}

