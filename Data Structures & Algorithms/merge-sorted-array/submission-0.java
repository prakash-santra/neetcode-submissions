class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right1 = m-1, right2 = n-1, end = nums1.length-1;
        while(right1 >=0 && right2 >= 0){
            if(nums1[right1] > nums2[right2]){
                nums1[end] = nums1[right1];
                right1--;
            }
            else{
                nums1[end] = nums2[right2];
                right2--;
            }
            end --;
        }
        while(right1 >= 0){
            nums1[end] = nums1[right1];
            right1--;
            end--;
        }
        while(right2 >= 0){
            nums1[end] = nums2[right2];
            right2--;
            end--;
        }
    }
}