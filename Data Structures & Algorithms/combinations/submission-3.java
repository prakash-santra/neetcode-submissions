class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        List<Integer>ans = new ArrayList<>();
        list = new ArrayList<>();
        comb(arr, k, ans, 0);
        return list;
        
    }
    public void comb(int[]arr, int k, List<Integer>ans, int count){
        if(count == arr.length){
            if(ans.size() == k)
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[count]);
        comb(arr, k, ans, count+1);
        ans.remove(ans.size() -1);
        comb(arr, k, ans, count+1);
    }
}