class Solution {
    public int findComplement(int n) {
        int count=0;
        int t=n;
        do
        {
            n=n>>1;
            count++;
        } while(n!=0);
        return  (~t)&((1<<count)-1);
        
    }
}