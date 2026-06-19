class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[j] = nums[i-1];
                j++;
            }
        }
        nums[j] = nums[nums.length - 1];
        return j+1;
    }
    
}

//  1 1 2 3 4 4 5 5
//  _ _ _ _ _
//  1 2 3 4