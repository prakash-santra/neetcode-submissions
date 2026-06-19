class Solution {
    public boolean canJump(int[] nums) {
        int step = 0;
        if(nums.length == 1)return true;
        for(int i=0; i<nums.length; i++){
            // if(nums[0] == 0)return false;

            // if(nums[step] != 0 || i <= step){
            if(i > step)return false;
                step = Math.max(nums[i] + i, step += nums[step]);
            // }

            if(step >= nums.length-1)return true;
        } 
        return true;
    }
}
