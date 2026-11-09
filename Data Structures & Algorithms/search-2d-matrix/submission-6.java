class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // if (arr.length == 0) {
        //     return false;
        //     }
        int row = bSearch(arr, target);
        if (row < 0 || row >= arr.length) {
return false;
}
        int s = 0;
        int e = arr[0].length-1;
        while(s <= e){
            int m = (s+e) / 2;
            int mid = arr[row][m];
            if(target == mid)return true;
            else if(mid < target)s = m + 1;
            else e = m - 1;
        }
        return false;
    }

    public int bSearch(int[][]arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = (s+e) / 2;
            int mid = arr[m][arr[0].length-1];
            if(mid == target) return m;
            else if(mid < target)s = m+1;
            else e = m-1;
        }
        return s;
    }
}
