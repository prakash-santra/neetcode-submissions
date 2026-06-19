class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0, k=0;
        for(int i=1; i<nums.length; i++){
            if(nums[j] != nums[i]){
                nums[k] = nums[j];
                k++;
            }
            j++;
        }
            nums[k] = nums[nums.length-1];
            k++;
        return k;
    }
}