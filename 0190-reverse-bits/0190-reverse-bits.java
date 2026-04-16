class Solution {
    public int reverseBits(int n) {
        int res=0;
        int c=31;
        while(n!=0){
            int t=n&1;
            n=n>>1;
            res=res|(t<<c);
            c--;
        }
        return res;
        
    }
}