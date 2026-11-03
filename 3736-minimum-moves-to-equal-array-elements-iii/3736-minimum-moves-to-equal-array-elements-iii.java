class Solution {
    public int minMoves(int[] nums) {
       int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=max-nums[i];
        }
        return result;
    }
}