// class Solution {
//     public int minimumSubarrayLength(int[] nums, int k) {
//         int winsize=1;
//         while(winsize<=nums.length){
//             if(finder(nums,k,winsize)){
//                 return winsize;
//             }
//             winsize++;

//         }
//         return -1;
//     }
//     public boolean finder(int nums[],int k,int winsize){
//         int n=nums.length;
//         for(int i=0;i<=n-winsize;i++){
//             int kor=nums[i];
//             for(int j=i+1;j<(i+winsize);j++){
//                 kor|=nums[j];
//             }
//             if(kor>=k){
//                 return true;
//             }
//         }
//         return false;

//     }
// }
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int orVal = 0;
            for (int j = i; j < n; j++) {
                orVal |= nums[j];
                if (orVal >= k) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}