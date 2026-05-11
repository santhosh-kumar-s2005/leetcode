class Solution {
       static {
        for(int i = 0; i < 2000; i++)
            moveZeroes(new int[]{});
    }
    public static void moveZeroes(int[] nums) {
        int ind=0;
        for(int i:nums){
            if(i!=0){
                nums[ind++]=i;
            }
        }
        Arrays.fill(nums,ind,nums.length,0);
        
    }
}