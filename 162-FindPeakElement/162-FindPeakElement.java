// Last updated: 9/4/2025, 12:06:42 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}