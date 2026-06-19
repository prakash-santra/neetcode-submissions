class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=i+1; j<nums.length; j++){
                int sum = -(nums[i] + nums[j]);

                if(!map.containsKey(sum)){
                    map.put(nums[j], j);
                }else{
                    int[]arr = {nums[i], nums[j], nums[map.get(sum)]};
                    Arrays.sort(arr);
                    List<Integer> list = Arrays.asList(arr[0], arr[1], arr[2]);
                    if(!ans.contains(list)){
                        ans.add(list);
                    }
                }

            }
        }
        return ans;
    }
}
