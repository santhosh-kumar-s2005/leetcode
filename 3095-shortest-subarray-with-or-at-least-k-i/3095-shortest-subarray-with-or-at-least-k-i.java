class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int winsize=1;
        while(winsize<=nums.length){
            if(finder(nums,k,winsize)){
                return winsize;
            }
            winsize++;

        }
        return -1;
    }
    public boolean finder(int nums[],int k,int winsize){
        int n=nums.length;
        if(n==winsize){
            int kor=0;
            for(int i:nums) kor|=i;
            return kor>=k;
        }
        for(int i=0;i<=n-winsize;i++){
            int kor=nums[i];
            for(int j=i+1;j<(i+winsize);j++){
                kor|=nums[j];
            }
            if(kor>=k){
                return true;
            }
        }
        return false;

    }
}