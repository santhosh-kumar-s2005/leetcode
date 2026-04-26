class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c){
            return mat;
        }
        int arr[][]=new int[r][c];
        int ir=0;
        int jr=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int curr=mat[i][j];
                arr[ir][jr++]=curr;
                if(jr==c){
                    jr=0;
                    ir++;
                }
            }
        }
        return arr;
    }
}