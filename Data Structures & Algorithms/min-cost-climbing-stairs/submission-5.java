class Solution {
    int[] val;

    public int minCostClimbingStairs(int[] cost) {
        val = new int[cost.length];
        Arrays.fill(val, -1);
        
        return Math.min(climb(cost, 0), climb(cost, 1));
    }

    public int climb(int [] cost, int step){
        if(step >= cost.length)return 0;

        if(val[step] != -1)return val[step];
        int val1 = climb(cost, step + 1);
        int val2 = climb(cost, step + 2);
        val[step] = cost[step] + Math.min(val1, val2);

        return val[step];
    }
}
