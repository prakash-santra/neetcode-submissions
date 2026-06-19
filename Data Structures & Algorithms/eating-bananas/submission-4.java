class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        for(int i=0; i<piles.length; i++){
            k = Math.max(k, piles[i]);
        }
        int rate = 1;
        while(rate <= k){
            int mid = rate + (k-rate) / 2;
            int time = hour(piles, mid);
            System.out.println(time);
            if(time > h){
                rate = mid + 1;
            }else{
                k = mid - 1;
            }
        }
        return rate;
    }
    public int hour(int[]pile, int k){
        int hr = 0;
        int cap = 0;
        for(int i=0; i<pile.length; i++){
            hr += Math.ceil((double)pile[i] / k);
        }
        return hr;
    }
}
