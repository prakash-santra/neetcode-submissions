class Solution {
    public int maxArea(int[] arr) {
        int ans = 0;
        int len = arr.length-1;
        int l =0, r =arr.length-1;
        while(l < r){
            ans = Math.max(ans, (len * Math.min(arr[l], arr[r])));
            if(arr[l] < arr[r]){
                l++;
            }
            else{
                r--;
            }
            len--;
        }
        return ans;
    }
}
