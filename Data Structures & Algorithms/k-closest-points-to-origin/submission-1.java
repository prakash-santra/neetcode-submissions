class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int[] ele : points){
            int distance = (int)(Math.pow(ele[0], 2) + Math.pow(ele[1], 2));
            q.offer(new int[]{distance, ele[0], ele[1]});
        }

         int[][]ans = new int[k][2];
         for(int i=0; i< k; i++){
            int[] ele = q.poll();
            ans[i][0] = ele[1];
            ans[i][1] = ele[2];
         }
         return ans;


    }
}
