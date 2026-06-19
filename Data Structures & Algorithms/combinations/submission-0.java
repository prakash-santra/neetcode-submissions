class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        List<Integer>ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        comb(arr, k, ans, list, 0);
        return list;
        
    }
    public static void comb(int[]arr, int k, List<Integer>ans, List<List<Integer>> list, int count){
        if(count == arr.length){
            if(ans.size() == k)
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[count]);
        comb(arr, k, ans, list, count+1);
        ans.remove(ans.size() -1);
        comb(arr, k, ans, list, count+1);
    }
}