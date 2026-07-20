class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res=new ArrayList<>();
        int row=grid.length;
        int col=grid[0].length;
        k=k%(row*col);
        k=(row*col)-k;
        k=k%(row*col);
        for(int i=0;i<row;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<col;j++){
             // System.out.println(k+" "+k/row+" "+k%col);
                temp.add(grid[k/col][k%col]);
                k=(k+1)%(row*col);
               

            }
            res.add(temp);
        }
        return res;
  

    }
}