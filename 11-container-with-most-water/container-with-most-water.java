class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int maxcapacity=0;

        while(start<end)
        {
            int length=Math.min(height[start],height[end]);
            int width = end-start;

            int currentcapacity=length*width;
             maxcapacity=Math.max(currentcapacity,maxcapacity);

             if(height[start]<height[end])
             {
                start++;
             }
             else
             {
                end--;
             }

        }
        return maxcapacity;
    }
}