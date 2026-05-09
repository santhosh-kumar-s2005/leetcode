class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int left=0,right=n-1;
        int up=0,down=m-1;
        while(up<down && left<right){
             int currarr[]=new int[2*(down-up+1)+2*((right-left+1)-2)];
             fill(currarr,grid,up,down,left,right,true);
           //  System.out.println(Arrays.toString(currarr));
             rotate(currarr,k%currarr.length);
             fill(currarr,grid,up,down,left,right,false);
             up++;
             left++;
             right--;
             down--;
           //  System.out.println(Arrays.toString(currarr));

        }
        return grid;
    }
    public void rotate(int currarr[],int k){
        int n=currarr.length;
        if(k==0) return;
        int tail[]=new int[k];
        for(int i=0;i<k;i++){
            tail[i]=currarr[i];
        }
        for(int i=0;i<n-k;i++){
            currarr[i]=currarr[i+k];
        }
        int ptr=0;
        for(int i=n-k;i<n;i++){
            currarr[i]=tail[ptr++];
        }
    }
    public void fill(int currarr[],int grid[][],int up,int down,int left,int right,boolean storing) {
        //crowiding curr and storing curr elements to grid after k rotations
        int ptr=0;
        //top layer
        for(int i=left;i<=right;i++,ptr++){
            if(storing){
            currarr[ptr]=grid[up][i];
            }
            else{
            grid[up][i]=currarr[ptr];
            }
        }
        //right layer
        for(int i=up+1;i<=down;i++,ptr++){
            if(storing){
            currarr[ptr]=grid[i][right];
            }
            else{
            grid[i][right]=currarr[ptr];
            }
        }
        //bottomlayer
        for(int i=right-1;i>=left;i--,ptr++){
            if(storing){
            currarr[ptr]=grid[down][i];
            }
            else{
            grid[down][i]=currarr[ptr];
            }
        }
        //leftlayer
        for(int i=down-1;i>=up+1;i--,ptr++){
             if(storing){
            currarr[ptr]=grid[i][left];
            }
            else{
            grid[i][left]=currarr[ptr];
            }
        }
    }   
}