class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr=ans.length-1;

        while(start<=end)
        {
            int startsquare=nums[start]*nums[start];
            int endsquare=nums[end]*nums[end];

            if(startsquare>=endsquare)
            {
                ans[ptr]=startsquare;
                start++;
            }
            else
            {
                ans[ptr]=endsquare;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}