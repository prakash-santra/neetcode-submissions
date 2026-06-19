class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pos = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            pos = mid;
            if(nums[mid] == target)return mid;
            if(target > nums[mid]){
                start = mid + 1;
            }
            if(target < nums[mid]){
                end = mid - 1;
            }
        }
        if(target < nums[pos])return pos;
        return pos+1;
    }
}