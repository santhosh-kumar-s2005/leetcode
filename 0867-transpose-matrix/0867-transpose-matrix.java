class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int res[][]=new int[col][row];
        int it=0,ij=0;
        for(int j=0;j<col;j++){
            
            for(int i=0;i<row;i++){
                res[it][ij++]=matrix[i][j];
            }
            ij=0;
            it++;
        }
        return res;
    }
}