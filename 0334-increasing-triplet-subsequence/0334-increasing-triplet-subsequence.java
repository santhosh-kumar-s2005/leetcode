class Solution {
    public boolean increasingTriplet(int[] nums) {
    int n=nums.length;
    int pr[]=new int[n];
    int su[]=new int[n];
    pr[0]=Integer.MAX_VALUE;
    su[n-1]=Integer.MIN_VALUE;
    int min=pr[0],max=su[n-1];
    for(int i=1;i<n;i++){
        min=Math.min(min,nums[i-1]);
        pr[i]=min;
    }
    for(int i=n-2;i>=0;i--){
        max=Math.max(max,nums[i+1]);
        su[i]=max;
    }
    System.out.println(Arrays.toString(pr));
    System.out.println(Arrays.toString(su));
    for(int i=0;i<n;i++){
        if(nums[i]>pr[i] && nums[i]<su[i]){
            return true;
        }
    }
    return false;


    }
}