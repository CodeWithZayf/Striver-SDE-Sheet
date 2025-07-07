class Solution {
    public int findDuplicate(int[] nums) {
        // Input validation
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }
        
        // Phase 1: Detect cycle using Floyd's algorithm
        // Treat array as a linked list where nums[i] points to nums[nums[i]]
        int slow = nums[0];
        int fast = nums[0];
        
        // Move pointers until they meet inside the cycle
        do {
            slow = nums[slow];           // tortoise moves 1 step
            fast = nums[nums[fast]];     // hare moves 2 steps
        } while (slow != fast);
        
        // Phase 2: Find the entrance to the cycle (the duplicate number)
        // Reset slow pointer to start, keep fast at meeting point
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];           // both move 1 step
            fast = nums[fast];
        }
        
        return slow; // This is the duplicate number
    }
}
