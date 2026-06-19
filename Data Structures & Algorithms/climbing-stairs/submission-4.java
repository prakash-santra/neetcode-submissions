class Solution {
    static int[] arr;
    public int climbStairs(int n) {
        arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = -1;
        }
        return climb(n, 0);
        
    }
    public static int climb(int val, int root){
        if(root >= val){
            if(root == val) return 1;
            return 0;
        }

        if(arr[root] != -1)return arr[root];
         return arr[root] = climb(val, root+1) + climb(val, root+2);
    }
}
