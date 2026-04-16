// class Solution {
//     public int singleNumber(int[] nums) {
//     int a=0;
//     for(int i:nums)
//     {
//         a^=i;
//     }
//     return a;
        
//     }
// }
class Solution {
    public int singleNumber(int[] nums) {
    int a=nums[0];
    for(int i=1;i<nums.length;i++)
    {
        a=a^nums[i];
    }
    return a;
        
    }
}