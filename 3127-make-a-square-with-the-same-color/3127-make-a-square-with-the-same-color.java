class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                int b=0,w=0;
                if(grid[i][j]=='B'){
                    b++;
                }
                else{
                    w++;
                }
                 if(grid[i][j+1]=='B'){
                    b++;
                }
                else{
                    w++;
                }
                 if(grid[i+1][j]=='B'){
                    b++;
                }
                else{
                    w++;
                }
                 if(grid[i+1][j+1]=='B'){
                    b++;
                }
                else{
                    w++;
                }
                if(b>=3 || w>=3){
                    return true;
                }
            }
        }
        return false;
        
    }
}