class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currentsum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<nums.length;i++) //remember the for loop starting
        {
            if(currentsum+nums[i]>nums[i])
            {
                currentsum+=nums[i];
            }
            else
            {
                currentsum=nums[i];
            }
           maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
}