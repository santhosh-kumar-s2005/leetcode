class Solution {
    public String winningPlayer(int x, int y) {
      int a=0;
      while(x>=1 && y>=4){
        a=(a==0)?1:0;
        x-=1;
        y-=4;
      }
//      System.out.print(a);
      return (a==1)?"Alice":"Bob";
    }
}