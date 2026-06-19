class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row = matrix.length;
       int col = matrix[0].length;
       int low = 0, high = matrix.length-1;
       while(low <= high){
        int mid = low + (high-low) / 2;
        if(target > matrix[mid][matrix[0].length -1]){
            low = mid + 1;
        }
        else if(target < matrix[mid][0]){
            high = mid - 1;
        }
        else{
            return b_Search(matrix[mid], target);
        }
       }
       return false;
    }
    public boolean b_Search(int[]arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s +(e-s)/2;
            if(target < arr[m]){
                e = m - 1;
            }
            else if(target > arr[m]){
                s = m+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
