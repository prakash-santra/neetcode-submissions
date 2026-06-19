class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = -1;
        for(int i=0; i<gas.length; i++){
            tank = 0;
            int step = i;
            int count = 0;
            while(count < gas.length){
                tank += gas[step];
                tank -= cost[step];
                if(tank < 0)break;                
                step = (step + 1) % gas.length;
                count++;
            }
            
            if(count == gas.length)return i;
        }
        return -1;
    }
}
