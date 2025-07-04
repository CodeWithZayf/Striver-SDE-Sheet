class Solution {
    public void sortColors(int[] nums) {
        int n0=0,n1=0,n2=0,n=nums.length;
        for(int i=0;i<n;i++) // Count the number of 0s, 1s, and 2s
        {
            if(nums[i]==0)
            n0++;
            else if(nums[i]==1)
            n1++;
            else
            n2++;
        }
        for(int i=0;i<n;i++) // Fill the array with 0s, 1s, and 2s based on the counts
        {
            if(i<n0)
            nums[i]=0;
            else if(i>=n0&&i<n1+n0)
            nums[i]=1;
            else
            nums[i]=2;
        }
    }
}