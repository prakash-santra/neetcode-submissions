class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            if(ele.getValue() > n/3){
                ans.add(ele.getKey());
            }
        }
        return ans;
    }
}