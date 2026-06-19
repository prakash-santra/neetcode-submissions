class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        int[]arr = {nums[i],nums[j], nums[k]};
                        Arrays.sort(arr);
                        List<Integer> list = Arrays.asList(arr[0],arr[1],arr[2]);
                        if(!ans.contains(list))
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
}
