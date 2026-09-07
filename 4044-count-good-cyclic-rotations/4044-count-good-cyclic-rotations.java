class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long windowSum = 0;
        for (int i = 0; i < half; i++) {
            windowSum += nums[i];
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (windowSum > totalSum - windowSum) {
                count++;
            }

            windowSum -= nums[i];
            windowSum += nums[(i + half) % n];
        }

        return count;
    }
}