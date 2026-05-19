class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k==1){
            return (double)Arrays.stream(nums).max().getAsInt();
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=((double)sum)/k;
        //System.out.println(maxavg);
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxavg=Math.max(maxavg,((double)sum)/k);
            //System.out.println(maxavg);
        }
        return maxavg;
    }
}