class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }

        for(int i=max; i<=sum; i++){
            if(count_Days(weights, i) <= days)return i;
        }
        return -1;
    }
    public int count_Days(int[]wt, int cap){
        int d = 1;
        int load = 0;
        for(int i=0; i<wt.length; i++){
            if(load + wt[i] > cap){
                d ++;
                load = wt[i];
            }else{
                load += wt[i];
            }
        }
        return d;
    }
}