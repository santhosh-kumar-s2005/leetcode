class Solution {//Tc=o(n+m) Sc=o(m) DP array removed from space
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int num:nums)max=Math.max(max,num);
        int[] points=new int[max+1];
        for(int num:nums)points[num]+=num;
        for(int i=3;i<=max;i++){
            points[i]=Math.max(points[i-2]+points[i],((i-3>0)?points[i-3]:0)+points[i]);
            System.out.print(points[i]+" ");
           
        }
        return Math.max(points[max],points[max-1]);
    }
}

//Standard dp Tc=o(n+m)  SC=o(m) with dp array
        // int max=0;
        // for(int num:nums)max=Math.max(max,num);
        // int[] points=new int[max+1];
        // for(int num:nums)points[num]+=num;
        // int[] dp=new int[max+1];
        // dp[0]=0; dp[1]=points[1];
        // for(int i=2;i<=max;i++){
        //    dp[i]=Math.max(dp[i-1],dp[i-2]+points[i]);
        // }
        // return dp[max];