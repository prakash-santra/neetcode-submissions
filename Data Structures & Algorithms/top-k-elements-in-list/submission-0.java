class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            heap.offer(new int[]{ele.getValue(), ele.getKey()});

            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = heap.poll()[1];
        }
        return ans;
    }
}
