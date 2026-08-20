class Solution {
    public boolean evendigit(int num)
    {
        int digit=0;
        while(num!=0)
        {
            num=num/10;
            digit++;
        }
        return digit%2==0;
        
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(evendigit(nums[i]))
            count++;
        }
        return count;
    }
}