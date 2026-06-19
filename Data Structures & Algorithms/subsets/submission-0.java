class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> ans = new ArrayList<>();   
      List<List<Integer>> list = new ArrayList<>();
      rec(nums, 0, ans, list);
      return list;
    }
    public void rec(int[]num, int count, List<Integer>ans, List<List<Integer>>list){
    
        if(count == num.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(num[count]);
        rec(num, count+1, ans, list);
        ans.remove(ans.size()-1);
        rec(num, count+1, ans, list);
    }
}
