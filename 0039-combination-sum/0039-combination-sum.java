class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result=new ArrayList<>();

        List<Integer> combo=new ArrayList<>();

        recur(0,result,combo,target,candidates);
        return result;
        
    }

    
    public void recur(int i,List<List<Integer>> result, List<Integer> combo,int target,int[] candidates){
        if(target==0){
            result.add(new ArrayList<>(combo));
            return;
        }

        if(target<0){
            return;
        }

        for(int j=i;j<candidates.length;j++){
            combo.add(candidates[j]);

            recur(j,result,combo,target-candidates[j],candidates);

            combo.remove(combo.size()-1);

        }
    }
}