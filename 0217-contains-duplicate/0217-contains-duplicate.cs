public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        List<int> list=new List<int>();

        foreach(int i in nums ){
            if (!list.Contains(i)){
                list.Add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}