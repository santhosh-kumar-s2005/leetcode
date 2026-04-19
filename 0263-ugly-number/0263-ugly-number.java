//  class Solution {
//     public boolean isUgly(int n) {
//         if(n==0){
//             return false;
//         }
//         while(n%2==0){
//             n = n/2;
//         }
//         while(n%3==0){
//             n = n/3;
//         }
//         while(n%5==0){
//             n = n/5;
//         }
//         return n==1;
//     }
// }
class Solution {
    public boolean isUgly(int n) {
        return n <= 0 ? false :
               (n % 3 == 0 ? isUgly(n / 3) :
               (n % 5 == 0 ? isUgly(n / 5) :
               ((n & (n - 1)) == 0)));
    }
}