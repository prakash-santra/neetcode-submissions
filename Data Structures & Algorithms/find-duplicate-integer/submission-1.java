class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int ele : nums){
            int val = Math.abs(ele) - 1;
            if(nums[val] < 0){
                return Math.abs(ele);
            }
            nums[val] *= -1;
        }
        return -1;
    }
}
