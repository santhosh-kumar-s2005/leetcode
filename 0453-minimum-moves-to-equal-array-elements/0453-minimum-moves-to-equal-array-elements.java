class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int index=1;index<nums.length;index++){
            result+=nums[index]-nums[0];
        }
        return result;
        
    }
}