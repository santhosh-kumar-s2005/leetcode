class Solution {
    public int reverseBits(int n) {
        int i=31;

        while(i>=16){
            int l = (n >> i) & 1;
            int r = (n >> (31 - i)) & 1;
            // int l=n&(1<<i);
            // int r=n&(1<<(31-i));
            n=n&~(1<<i);
            n=n|(r<<i);
            n=n&~(1<<(31-i));
            n=n|(l<<(31-i));
            i--;
            
        }
        return n;
        
    }
}

// class Solution {
//     public int reverseBits(int n) {
//         int res=0;
//         int c=31;
//         while(n!=0){
//             int t=n&1;
//             n=n>>1;
//             res=res|(t<<c);
//             c--;
//         }
//         return res;
        
//     }
// }