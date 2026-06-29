public class Solution {
    public int MissingNumber(int[] nums) {
        int n=nums.Length;
        int asum= (n*(n+1)/2);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        return asum-sum;
    }
}