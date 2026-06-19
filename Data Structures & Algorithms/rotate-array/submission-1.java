class Solution {
    public void rotate(int[] nums, int val) {
        int k =  val % nums.length;
        for(int i=0; i<k; i++){
            for(int j = nums.length-k+i; j>i; j--){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
}