import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer>result=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        int a=Math.abs(nums[i]);
        
        if(nums[a-1]>0){
            nums[a-1]=-nums[a-1];
        }
        else{
            result.add(a);
        }
        
       }
       return result;

    }
}