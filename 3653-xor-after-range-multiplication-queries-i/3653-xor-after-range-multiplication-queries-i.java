class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
        for(int i=0;i<q.length;i++){
            int l=q[i][0],r=q[i][1],k=q[i][2],v=q[i][3];
            while(l<=r){
             long temp=nums[l];
                nums[l]=(int)((temp*v)%(1000000007));
                l+=k;
            }
        }
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
    }
}