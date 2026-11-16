class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        
        int e=nums.length-1;
        if(nums[s] > nums[e]){
            int pivot = find_Pivot(nums);
            System.out.print(pivot);
            if(target > nums[e]){
                e = pivot;
            }else
            s = pivot+1;
        }
        while(s <= e){
            int m = (s+e) / 2;
            if(nums[m] == target)return m;
            else if(nums[m] > target)e = m-1;
            else
            s = m+1;
        }
        return -1;
    }
    public int find_Pivot(int[]arr){
        int s=0, e=arr.length-1;
        if(arr[s] < arr[e])return e;

        while(s < e){
            int m = (s+e) / 2;
            if(arr[m] > arr[m+1])return m;
            else if(arr[m] > arr[s]) s=m;
            else
            e = m;
        }
        return s;
    }
}
