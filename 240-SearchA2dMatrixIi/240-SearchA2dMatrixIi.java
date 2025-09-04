// Last updated: 9/4/2025, 12:06:02 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int n=matrix[0].length;
        int j=n-1;
        
        while(i<matrix.length&&j>=0){
            if(matrix[i][j]==target){
            return true;
            }
            if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
    }
}