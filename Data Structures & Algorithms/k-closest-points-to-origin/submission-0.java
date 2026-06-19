class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Double> heap = new HashMap<>();

        for(int i=0 ; i<points.length; i++){
                heap.put(i, Math.sqrt(Math.pow((points[i][0]),2) + 
                                    Math.pow((points[i][1]),2)));
            }
            PriorityQueue<double[]> q = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));
            for(Map.Entry<Integer, Double> ele : heap.entrySet()){
                q.offer(new double[]{ele.getValue(), ele.getKey()});
            }

            int[][] ans = new int[k][2];
            for(int i=0; i<k; i++){
                double val = q.poll()[1];
                ans[i][0] = points[(int)val][0];
                ans[i][1] = points[(int)val][1];
            }
            return ans;

    }
}


