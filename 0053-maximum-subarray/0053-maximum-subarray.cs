public class Solution
{
    public int MaxSubArray(int[] nums)
    {
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.Length; i++)
        {
            sum = Math.Max(nums[i], sum + nums[i]);
            max = Math.Max(max, sum);
        }

        return max;
    }
}