class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i=0; i<piles.length; i++){
            r = Math.max(r, piles[i]);
        }

        while(l <= r){
            int mid = (l + r)/2;
            int time = hour(piles, mid);
            if(time > h) l=mid+1;
            else r=mid-1; 
        }
        return l;
    }
    public int hour(int[]arr, int val){
        int hr = 0;
        for(int i=0; i<arr.length; i++){
            hr += Math.ceil((double)arr[i] / val);
        }
        return hr;
    }
}
