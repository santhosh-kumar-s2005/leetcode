class Solution {
    public int minChanges(int n, int k) {
        int ch=0;
        int times=0;
        while(times<=31){
            if((n&1) != (k&1)){
                if((n&1)==1) ch++;
                else return -1;
            }
            n>>=1;
            k>>=1;
            times++;
        }
        return ch;
    }
}