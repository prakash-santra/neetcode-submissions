class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, sum=0, size = Integer.MAX_VALUE;
        boolean flag = true;
        for(int i=0; i<nums.length; i++){
            if(sum < target){
                sum += nums[i];
            }
            while(sum >= target){
                flag = false;
                size = Math.min(size, i-l+1);
                sum -= nums[l];
                l++;
               
            }
        }
        if(flag==true)return 0;
        else
        return size;
    }
}