class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)return nums[0];
        int count = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                count ++;
                if(count >= nums.length/2)return nums[i];
            }else{
                count = 1;
            }
        }
        return 0;
    }
}