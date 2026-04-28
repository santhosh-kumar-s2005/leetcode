class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        for(int i=2;i<nums.length;i++){
            nums[i]+=Math.max(nums[i-2],(i-3<0)?0:nums[i-3]);
        }
        return Math.max(nums[nums.length-1],nums[nums.length-2]);
    }
}