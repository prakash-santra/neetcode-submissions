class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int count = -1;
        int total = nums1.length+nums2.length;
        int len = total/2;

        int i=0, j=0;
        int curr = 0;
        int ans =0;
        while(i < nums1.length && j < nums2.length){
            ans = curr;
            if(nums1[i] > nums2[j]){ 
                curr = nums2[j];
                j++;
            }else{
                curr = nums1[i];
                i++;
            }
            count++;
            if(count == len){
                if(total % 2 != 0)return curr;
                else{
                    return (ans+curr) /2.0;
                }
            }
        }
        while(i < nums1.length){
            ans = curr;
            curr = nums1[i];
            i++;
            count++;
            if(count == len){
                if(total % 2 != 0)return curr;
                else{
                    return(ans+curr) /2.0;
                }
            }
        }
        while(j < nums2.length){
            ans = curr;
            curr = nums2[j];
            j++;
            count++;
            if(count == len){
                if(total % 2 != 0)return curr;
                else{
                    return(ans+curr) /2.0;
                }
            }
        }
        return 0.0;
    }
}
