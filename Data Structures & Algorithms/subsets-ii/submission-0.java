class Solution {
    public static List<List<Integer>>root;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        root = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer>ans = new ArrayList<>();
        comb(nums, ans);
        return root;
    }
    public static void comb(int[]arr, List<Integer>ans){
        if(arr.length == 0){
            if(!root.contains(ans)){
                root.add(new ArrayList<>(ans));
            }
            return;
        }
        ans.add(arr[0]);
        comb(Arrays.copyOfRange(arr, 1, arr.length), ans);
        ans.remove(ans.size()-1);
        comb(Arrays.copyOfRange(arr, 1, arr.length), ans);
    }
}
