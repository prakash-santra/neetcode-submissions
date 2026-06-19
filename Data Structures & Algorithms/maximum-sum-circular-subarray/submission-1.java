class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int val=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            val = Math.max(val, subarray(nums, i));
        }
        return val;
    }
    public static int subarray(int[] nums, int pos){
        int sum = nums[pos];
        int val = nums[pos];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[(pos + i) % nums.length],
                            sum + nums[(pos + i) % nums.length]);
            val = Math.max(val, sum);
        }
        return val;
    }
}