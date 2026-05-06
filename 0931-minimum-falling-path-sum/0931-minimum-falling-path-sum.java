class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        if(n==1) return matrix[0][0];
        for(int row=1;row<n;row++){
            for(int col=0;col<n;col++){
                if(col==0){
                    matrix[row][col]+=Math.min(matrix[row-1][col],matrix[row-1][col+1]);
                }
                else if(col==n-1){
                    matrix[row][col]+=Math.min(matrix[row-1][col],matrix[row-1][col-1]);
                }
                else{
                     matrix[row][col]+=Math.min(Math.min(matrix[row-1][col-1],matrix[row-1][col]),matrix[row-1][col+1]);
                }
            }
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.min(max,matrix[n-1][i]);
        }
        return max;

    }
}