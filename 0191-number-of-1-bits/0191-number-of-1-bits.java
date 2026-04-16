class Solution {
    public int hammingWeight(int n) {
        if((n&(n-1))==0){
            return 1;
        }
        int count =0;
        while(n!=0){
            count+=n&1;
            n=n>>>1;
            
        }
        return count;
        
    }
}