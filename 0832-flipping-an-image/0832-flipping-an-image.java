class Solution {
    public int[][] flipAndInvertImage(int[][] res) {
        int n=res.length;
        boolean odd=false;
        if(n%2==1){
            odd=true;
        }
        for(int i=0;i<n;i++){
            int p1=0;
            int p2=n-1;
            while(p1<p2){
                int t1=res[i][p1];
                int t2=res[i][p2];
                res[i][p1]=(~t2)&1;
                res[i][p2]=(~t1)&1;
                p1++;
                p2--;
            }
            if(odd){
                res[i][n/2]=(res[i][n/2]==0)?1:0;
            }
        }
        return res;
    }

}