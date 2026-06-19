class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        int l=0;
        for(int i=0; i<nums.length; i++){            
            if(i-l>k){
                window.remove(nums[l]);
                l++;
            }
            if(window.contains(nums[i]))return true;
            window.add(nums[i]);
        }
        return false;
    }
}