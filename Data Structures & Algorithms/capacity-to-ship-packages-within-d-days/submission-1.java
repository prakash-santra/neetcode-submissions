class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
        
        while(max <= sum){
            int m = max + (sum-max)/2;
            int numDay = count_Days(weights, m);
            if(numDay > days){
                max = m + 1;
            }
            else if(numDay <= days){
                sum = m - 1;
            }
        }
        return max;
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