public class Solution {
    public int MaximumDifference(int[] nums) {
        int min=nums[0];
        int max=-1;

        for(int i=0;i<nums.Length;i++){
            if(min<nums[i]){
                max=Math.Max(max,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return max;
    }
}