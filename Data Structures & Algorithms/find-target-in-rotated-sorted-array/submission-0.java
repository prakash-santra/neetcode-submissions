class Solution {
    public int search(int[] nums, int target) {
        int pivot = -1;
        int s=0, e=nums.length-1;
        if(nums[s] > nums[e]){
            while(s<=e){
            int m = s+(e-s)/2;
            if(m<nums.length-1 && nums[m] > nums[m+1]){
                pivot = m;
                break;
                }
            else if(nums[s] > nums[m]) e=m-1;
            else s=m+1; 
            }
        if(target >= nums[0]){
            return b_Search(nums, 0, pivot, target);
        }else{
            return b_Search(nums, pivot+1, nums.length-1, target);
        }
    }
        return b_Search(nums,0, nums.length-1, target);
    }
    public int b_Search(int[]arr,int s, int e, int val){
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == val)return m;
            else if(val > arr[m]) s=m+1;
            else e=m-1;
        }
        return -1;
    }
}
