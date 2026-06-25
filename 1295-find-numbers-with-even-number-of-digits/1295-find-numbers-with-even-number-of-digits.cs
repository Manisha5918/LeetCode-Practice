public class Solution {
    public int FindNumbers(int[] nums) {
        int count=0;
        foreach(int num in nums){
            int digits=num.ToString().Length;
            if (digits%2==0){
                count++;
            }
        }
        return count;
    }
}