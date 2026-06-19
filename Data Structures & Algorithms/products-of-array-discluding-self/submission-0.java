class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]ans = new int[nums.length];
        int prod = 1;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
            zero ++;
            else
            prod *= nums[i];
        }
        if(zero >1)return ans;
        if(zero == 1){
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    ans[i] = prod;
                }
            }
            return ans;
        }
        else{
            for(int i=0; i<nums.length; i++){
                    ans[i] = prod / nums[i];
            }
        }
        return ans;
    }
}  
