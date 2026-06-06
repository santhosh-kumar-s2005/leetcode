class Solution {
    public int[] leftRightDifference(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            res[i]=nums[i-1]+res[i-1];
        }
        int rightsum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            res[i]=Math.abs(res[i]-rightsum);
            rightsum+=nums[i];
        }
        return res;
        
    }
}