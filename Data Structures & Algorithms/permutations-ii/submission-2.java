class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer>list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[]visit = new boolean[nums.length];
        permut(nums, list, ans, visit);
        return ans;

    }
    public static void permut(int[]nums, List<Integer>list, List<List<Integer>> ans, boolean[]visit){
        if(list.size() == nums.length){
            if(!ans.contains(list))
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visit[i]){
                list.add(nums[i]);
                visit[i] = true;
                
                permut(nums, list, ans, visit);
                list.remove(list.size()-1);
                visit[i] = false;
            }
        }
    }
}