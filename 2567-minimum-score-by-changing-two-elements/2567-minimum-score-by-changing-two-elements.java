class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length==3) return 0;
        int n=nums.length;
    // min1 min2 min3 
    // max1 max2 max3
    // min1 max3
    // min2 max2
    // min3 max1
    Arrays.sort(nums);
    int min1=nums[0],min2=nums[1],min3=nums[2];
    int max1=nums[n-1],max2=nums[n-2],max3=nums[n-3];
    System.out.println(Arrays.toString(nums));
    System.out.println(min1+" "+min2+" "+min3);


        return Math.min(Math.min(max3-min1,max2-min2),max1-min3);
        
    
}
}

