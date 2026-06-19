class Solution {
    static List<List<Integer>>root;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        root = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
        comb(nums, target, ans, 0);
        return root;
    }
    
    public static void comb(int[]arr,int target, List<Integer>ans, int i){
        if(target == 0){
                root.add(new ArrayList<>(ans));
            return;
        }if(target < 0 || i >= arr.length){
            return;
        }
        ans.add(arr[i]);
        comb(arr, target-arr[i], ans, i);
        ans.remove(ans.size()-1);
        comb(arr, target, ans, i+1);
    }
}
