class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int mli=1;
        int mld=1;
        int temp1=1,temp2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                temp1++;
                temp2=1;
                mli=Math.max(mli,temp1);
            }
            else if(nums[i-1]<nums[i]){
                temp2++;
                temp1=1;
                mld=Math.max(mld,temp2);
            }
            else{
                temp1=1;
                temp2=1;
            }
        

        }
        return Math.max(mli,mld);
        
    }
}