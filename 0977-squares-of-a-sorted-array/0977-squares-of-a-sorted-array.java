import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i] * nums[i];
            arr.add(num);
        }

        Collections.sort(arr);

        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}