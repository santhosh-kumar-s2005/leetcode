class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        if(m==1 && n==1) return matrix[0][0]-'0';
        if(m==1){
            for(int i=0;i<n;i++){
                if(matrix[0][i]=='1'){
                    return 1;
                }
            }
            return 0;
        }
        if(n==1){
            for(int i=0;i<m;i++){
                if(matrix[i][0]=='1'){
                    return 1;
                }
            }
            return 0;
        }
        int mat[][]= new int[m][n];
        int maxarea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=matrix[i][j]-'0';
                if(mat[i][j]==1 && maxarea==0) maxarea=1;
            }
        }
     
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]==1 && mat[i-1][j-1]>=1 && mat[i-1][j]>=1 && mat[i][j-1]>=1 ){
                    mat[i][j]=Math.min(Math.min(mat[i-1][j-1],mat[i-1][j]),mat[i][j-1])+1;
                    maxarea=Math.max(maxarea,mat[i][j]);
                }
            }
        }
         for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
       
        return maxarea*maxarea;
        
    }
}