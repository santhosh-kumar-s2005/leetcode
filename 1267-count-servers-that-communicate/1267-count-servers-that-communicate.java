class Solution {
    public int countServers(int[][] grid) {
        int columns[]=new int[grid[0].length];
        int rows[]=new int[grid.length];
        populate(grid,rows,true);
        populate(grid,columns,false);
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                    
                    if((grid[i][j]==1)&&(rows[i]>1 || columns[j]>1)){
                        ans++;
                    }


            }
        }
        return ans;
        
    }
    public static void populate(int grid[][],int arr[],boolean flag){
        int row=(flag)?grid.length:grid[0].length;
        int col=(flag)?grid[0].length:grid.length;
         for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(flag){
                if(grid[i][j]==1){
                    count++;
                }}
                else{
                    if(grid[j][i]==1){
                    count++;
                }

                }
            }
            arr[i]=count;
         }
    }
}