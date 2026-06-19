class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+1 );
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            heap.offer(new int[]{ele.getValue(), ele.getKey()});
        }
        List<Integer> list = new ArrayList<>();
        while(heap.size() != 0){
            if(heap.peek()[0] > nums.length/3){
                list.add(heap.poll()[1]);
            }else{
                heap.poll();
            }
        }
        return list;
    }
}
