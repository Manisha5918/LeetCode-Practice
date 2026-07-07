public class Solution
{
    public int MaxDistance(int[] colors)
    {
        int n = colors.Length;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--)
        {
         if (colors[i] != colors[0])
            {
                ans = i;      
                break;
            }
        }
           for (int i = 0; i < n; i++)
        {
            if (colors[i] != colors[n - 1])
            {
            ans = Math.Max(ans, (n - 1) - i);
            break;
            }
        }
        return ans;
    }
}