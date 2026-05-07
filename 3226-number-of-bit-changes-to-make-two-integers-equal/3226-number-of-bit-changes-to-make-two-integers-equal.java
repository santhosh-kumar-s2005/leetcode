// class Solution {
//     public int minChanges(int n, int k) {
//         int ch=0;
//         int times=0;
//         while(times<=31){
//             if((n&1) != (k&1)){
//                 if((n&1)==1) ch++;
//                 else return -1;
//             }
//             n>>=1;
//             k>>=1;
//             times++;
//         }
//         return ch;
//     }
// }
class Solution {
    public int minChanges(int n, int k) {
        if((n&k)!=k) return -1;
        int xor=n^k;
        int count=0;
        while(xor>0){
            count+=xor&1;
            xor>>=1;
        }
        return count;
        
    }
}