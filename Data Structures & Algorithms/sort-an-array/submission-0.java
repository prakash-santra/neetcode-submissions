class Solution {
    public int[] sortArray(int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;

        if(arr.length == 1){
            return arr;
        }

        int[] left = sortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);   
    }
    public int[] merge(int[] left, int[] right){
        int[]ans = new int[left.length + right.length];
        int ct = 0;
        int i=0, j = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ans[ct] = left[i];
                i++;
            }else{
                ans[ct] = right[j];
                j++;
            }
            ct++;
        }
        while(i<left.length){
            ans[ct] = left[i];
            i++;
            ct++;
        }
        while(j < right.length){
            ans[ct] = right[j];
            j++;
            ct++;
        }
        return ans; 
    }
}