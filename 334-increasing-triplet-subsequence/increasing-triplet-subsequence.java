class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE; 
       int second=Integer.MAX_VALUE; 
       int third=Integer.MAX_VALUE; 

       for(int i=0;i<nums.length;i++)
       {
        int elements=nums[i];

        if(first>=elements)
        {
            first=elements;
        }
        else if(second>=elements)
        {
            second=elements;
        }
        else
        {
            third=elements;
            return true;
        }
       }
       return false;
    }
}