class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = f_pivot(nums);
        if(pivot < 0){
        return b_Search(nums,0, nums.length-1, target);
    }
    if(target >= nums[0]){
            return b_Search(nums, 0, pivot, target);
        }else{
            return b_Search(nums, pivot+1, nums.length-1, target);
        }
    }

    public boolean b_Search(int[]arr,int s, int e, int val){
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == val)return true;
            else if(val > arr[m]) s=m+1;
            else e=m-1;
        }
        return false;
    }
    public int f_pivot (int[]nums){
        int s=0, e=nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(m<nums.length-1 && nums[m] > nums[m+1]){
                return m;
                }
                if(m > s && nums[m] < nums[m-1]){
                    return m-1;
                }
                if(nums[m] == nums[s] && nums[m] == nums[e]){
                    if(s<e && nums[s] > nums[s+1]){
                        return s;
                    }
                    s++;
                    if(e>s && nums[e] < nums[e-1]){
                        return e-1;
                    }
                    e--;
                    continue;
                }
                if(nums[s] < nums[m] ||
                (nums[s] == nums[m] && nums[m] > nums[e])){
                    s = m + 1;
                }else{
                    e = m-1;
                }
            }
            return -1;
    }
}















