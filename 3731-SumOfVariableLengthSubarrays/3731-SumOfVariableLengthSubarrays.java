// Last updated: 9/4/2025, 11:58:36 AM
class Solution {
    public int subarraySum(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int start = Math.max(0, i - nums[i]);
            int subarraySum = 0;
            
            for (int j = start; j <= i; j++) {
                subarraySum += nums[j];
            }
            
            totalSum += subarraySum;
        }
        
        return totalSum;
        
        
    }
}