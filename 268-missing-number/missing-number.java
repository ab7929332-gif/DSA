class Solution {
    public int missingNumber(int[] nums) {
        int i,sum=0;
        int range = nums.length;
        int actualsum=(range*(range+1))/2;
        for (i=0;i<nums.length;i++)
        {
            sum=sum+nums[i]; 

        }
        int ans = actualsum-sum;
        return ans;
        
    }
}