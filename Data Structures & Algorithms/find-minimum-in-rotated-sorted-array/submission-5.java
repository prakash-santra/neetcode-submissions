class Solution {
    public int findMin(int[] nums) { 
        if(nums[0] < nums[nums.length-1]) return nums[0];
        if(nums.length == 1)return nums[0]; 

        int s = 0, e = nums.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            
            if(mid < nums.length-1 && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid] < nums[s]){
                e = mid - 1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}
