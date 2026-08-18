class Solution {
    public int minKBitFlips(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         if (i+k>nums.length){
        //             return -1;
        //         }
        //         for(int j=i;j<i+k;j++){
        //             if (nums[j]==0){
        //                 nums[j]=1;
        //             }
        //             else{
        //                 nums[j]=0;
        //             }
        //         }
        //         count++; 
        //     }
        // }
        // return count;



        int n = nums.length;
        int[] sol = new int[n + 1];

        int flip = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {

            // Remove the effect of a flip that ended here
            if (i >= k) {
                flip -= sol[i - k];
            }

            // Check effective value
            if ((nums[i] + flip) % 2 == 0) {

                // Not enough elements for a k-length flip
                if (i + k > n) {
                    return -1;
                }

                // Start a new flip
                flip++;
                sol[i] = 1;
                res++;
            }
        }

        return res;
            
    }
}