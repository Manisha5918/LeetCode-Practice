import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List <Integer> subset=new ArrayList<>();

        List<List <Integer>> result=new ArrayList<>();

        recur(0,subset,nums,result);

        return result;
        
    }
        public void recur(int i,List<Integer> subset, int[] nums,  List<List <Integer>> result){

            result.add(new ArrayList<>(subset));
    
            for(int j=i;j<nums.length;j++){
                subset.add(nums[j]);

                 recur(j+1,subset,nums,result);
                 subset.remove(subset.size()-1);

            }


        }

        
    }
