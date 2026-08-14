class Solution {
    public int maximumCount(int[] nums) {

        int lastNeg = lastNegative(nums);
        int firstPos = firstPositive(nums);

        int negCount = lastNeg + 1;
        int posCount = nums.length - firstPos;

        return Math.max(negCount, posCount);
    }

    public int lastNegative(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] < 0) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public int firstPositive(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}