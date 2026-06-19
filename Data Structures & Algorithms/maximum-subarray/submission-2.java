class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int val = nums[0];
        if(nums.length <= 1)return nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
             val = Math.max(val, sum);
        }
        return val;
    }
}
