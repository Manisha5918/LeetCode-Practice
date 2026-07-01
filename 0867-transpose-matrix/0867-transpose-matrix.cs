public class Solution
{
    public int[][] Transpose(int[][] matrix)
    {
        int rows = matrix.Length;
        int cols = matrix[0].Length;
        int[][] ans = new int[cols][];
        for (int i = 0; i < cols; i++)
        {
            ans[i] = new int[rows];
        }
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}