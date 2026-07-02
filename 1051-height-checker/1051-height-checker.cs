public class Solution
{
    public int HeightChecker(int[] heights)
    {
        int n = heights.Length;
        int[] expected = new int[n];
        for (int i = 0; i < n; i++)
        {
            expected[i] = heights[i];
        }
        Array.Sort(expected);
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (heights[i] != expected[i])
            {
                count++;
            }
        }
        return count;
    }
}