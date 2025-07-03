class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempsum = currentSum + nums[i];
            currentSum = (nums[i]>tempsum)?nums[i]:tempsum; // If current element is greater than the sum of current subarray, start new subarray
            maxSum = (maxSum>currentSum)?maxSum:currentSum; // Update maxSum if currentSum is greater
        }

        return maxSum;
    }
}