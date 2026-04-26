class Solution {
    public int[] evenOddBit(int n) {
        int evencount=0;
        int oddcount=0;
        int e=1;
        while(n!=0){
            if(e==1){
                if((n&1)==1){
                    evencount++;
                }
            }
            else{
                if((n&1)==1){
                    oddcount++;
                }
            }
            e^=1;
            n>>=1;
        }
        return new int[] {evencount,oddcount};
        
    }
}