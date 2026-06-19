class Solution {
    public boolean canJump(int[] nums) {
        int step = 0;
        if(nums.length == 1)return true;
        for(int i=0; i<nums.length; i++){
            if(i > step)return false;

            step = Math.max(nums[i] + i, step);

            if(step >= nums.length-1)return true;
        } 
        return true;
    }
}
