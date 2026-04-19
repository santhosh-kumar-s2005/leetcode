class Solution {
    public boolean isPowerOfTwo(int n) {
        //return (n>0 && (n&(n-1))==0);
        return (Math.log10(n)/Math.log10(2))%1==0;
    }
}