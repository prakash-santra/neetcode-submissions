class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int temp = 0;
            for(int j=0; j<nums.length-i ; j++){
                if(nums[temp] < nums[j]){
                    temp = j;
                }
            }
        int val = nums[temp];
        nums[temp] = nums[nums.length-i-1];
        nums[nums.length-i-1] = val;
        }
       
    }
}