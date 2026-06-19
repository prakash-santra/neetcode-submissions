class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(target <= matrix[i][matrix[0].length-1]){
                return b_Search(matrix[i], target);
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
